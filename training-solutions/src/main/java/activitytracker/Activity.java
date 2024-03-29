package activitytracker;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    long id;
    LocalDateTime startTime;
    String desc;
    ActivityType type;
    List<TrackPoint> trackPoints;

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }
}
