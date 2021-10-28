package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    //Készíts minden attribútumhoz gettert, a duration attribútumhoz settert,
    // és egy start() metódust, mely a startDateTime attribútumot az aktuális dátumra és időpontra állítja be!

    public void start (){
        startDateTime = LocalDateTime.now();
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }
}
