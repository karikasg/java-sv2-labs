package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Kéktúra", LocalDate.of(2021, 11, 1));
        cyclingTour.printTour();
        cyclingTour.registerPerson(4);
        cyclingTour.registerPerson(6);
        cyclingTour.ride(80);
        cyclingTour.ride(60);
        cyclingTour.printTour();
    }
}
