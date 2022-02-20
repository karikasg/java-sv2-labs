package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity) {
        long id;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities (start_time, activity_desc, activity_type) values (?,?,?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().name());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getLong(1);
                activity.setId(id);
            } else {
                throw new SQLException("No key has generated");
            }
            if (activity.getTrackPoints() != null) saveTrackPoints(id, activity, connection);

        }
        catch (SQLException throwables) {
            throw new IllegalStateException("Cannot add", throwables);
        }
        return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
    }

    private void saveTrackPoints(long activityId, Activity activity, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("insert into track_point(activity_date, lat, lon, activity_id) values (?, ?, ?, ?);")) {
            conn.setAutoCommit(false);
            for (TrackPoint t : activity.getTrackPoints()) {
                if (t.getLat() < -90.0 || t.getLat() > 90.0 || t.getLon() < -180 || t.getLon() > 180.0) {
                    conn.rollback();
                    throw new IllegalArgumentException("Illegal value in coordinates!");
                }
                stmt.setDate(1, Date.valueOf(t.getTime()));
                stmt.setDouble(2, t.getLat());
                stmt.setDouble(3, t.getLon());
                stmt.setLong(4, activityId);
                stmt.executeUpdate();
            }
            conn.commit();
            conn.setAutoCommit(true);
        }
    }


    public Activity findActivityById(long id) {
        Activity result = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities where id = ?");
        ) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String desc = rs.getString("activity_desc");
                ActivityType activityType = ActivityType.valueOf(rs.getString("activity_type"));
                List<TrackPoint> trackPoints = new ArrayList<>();
                try (PreparedStatement stmt2 = connection.prepareStatement("select * from track_point where activity_id = ?")) {
                    stmt2.setLong(1, id);
                    rs = stmt2.executeQuery();
                    while (rs.next()) {
                        LocalDate date = rs.getDate("activity_date").toLocalDate();
                        Double lat = rs.getDouble("lat");
                        Double lon = rs.getDouble("lon");
                        trackPoints.add(new TrackPoint(date, lat, lon));
                    }
                }
                result = new Activity(id, startTime, desc, activityType, trackPoints);
            }
        }
        catch (SQLException throwables) {
            throw new IllegalStateException("Cannot get", throwables);
        }
        return result;
    }

    public List<Activity> listActivities() {
        List<Activity> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities");
        ) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id");
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String desc = rs.getString("activity_desc");
                ActivityType activityType = ActivityType.valueOf(rs.getString("activity_type"));
                result.add(new Activity(id, startTime, desc, activityType));
            }
        }
        catch (SQLException throwables) {
            throw new IllegalStateException("Cannot get", throwables);
        }
        return result;
    }
}
