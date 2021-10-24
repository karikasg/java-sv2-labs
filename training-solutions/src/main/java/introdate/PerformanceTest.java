package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1986, 7, 27);
        String artist = "Queen";
        LocalTime startTime = LocalTime.of(20, 0);
        LocalTime endTime = LocalTime.of(22, 0);

        Performance performance = new Performance(date, artist, startTime, endTime);

        System.out.println('"' + performance.getArtist() + ": " + performance.getDate() + " " +
                performance.getStartTime() + " - " + performance.getEndTime() + '"');

        System.out.println(performance.getInfo());
    }
}
