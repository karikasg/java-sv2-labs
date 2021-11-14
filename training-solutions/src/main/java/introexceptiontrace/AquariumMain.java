package introexceptiontrace;

public class AquariumMain {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Hal1", "fekete");
        Fish fish2 = new Fish("Hal2", "fehér");
        Fish fish3 = new Fish("Hal3", "szürke");
        Fish fish4 = new Fish("Hal4", "zöld");

        Aquarium aquarium = new Aquarium();

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);

        System.out.println(aquarium.getNumberOfFish());
    }
}
