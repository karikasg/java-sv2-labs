package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(123.456, true);

        System.out.println("Távolság: " + distance.getDistanceInKm() + " km, pontos érték?: " + (distance.isExact() ? "igen":"nem"));

        int distanceInt = (int) distance.getDistanceInKm();

        System.out.println("A távolság egész számként: " + distanceInt);
    }
}
