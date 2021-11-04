package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Fifi", 4, "fehér");
        Dog dog2 = new Dog("Kormos", 8, "fekete");
        Dog dog3 = new Dog("Manci", 14, "barna");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("szürke");
        System.out.println(dogs);

        Dog dog5 = new Dog("Csöpi", 1, "tarka");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("sárga");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;
        Dog dog7 = dog4;
        dog7.setColour("kék");
        System.out.println(dogs2);

        dog2.setColour("zöld");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("színtelen");
        System.out.println(dogs2);
    }
}
