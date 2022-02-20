package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static activitytracker.ActivityType.*;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        }
        catch (
                SQLException throwables) {
            throw new IllegalStateException("Cannot reach database", throwables);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityDao activityDao = new ActivityDao(dataSource);

        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        List<TrackPoint> trackpoints1 = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
        List<TrackPoint> trackpoints2 = Arrays.asList(trackPoint2, trackPoint3, trackPoint5);

        Activity activity1 = new Activity(LocalDateTime.now(), "Biciklizés", BIKING, trackpoints1);
        Activity activity2 = new Activity(LocalDateTime.now(), "Túrázás", HIKING, trackpoints1);
        Activity activity3 = new Activity(LocalDateTime.now(), "Futás", RUNNING, trackpoints2);
        Activity activity4 = new Activity(LocalDateTime.now(), "Kosárlabdázás", BASKETBALL);
        Activity activity5 = new Activity(LocalDateTime.now(), "Biciklizés", BIKING, trackpoints2);

        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);
        activityDao.saveActivity(activity5);

        System.out.println(activityDao.findActivityById(2));

        System.out.println(activityDao.listActivities());

    }
}
