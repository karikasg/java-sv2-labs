package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void ride(double km){
        kms += km;
    }

    public void printTour(){
        System.out.println("Túra neve: " + description + ", időpontja: " + startTime +
                " , résztvevők száma: " + numberOfPeople + ", megtett távolság: " + kms + " km");
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
}
