package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Pista");
        names.add("Jóska");
        names.add("Gyuri");
        names.add("Gábor");
        names.add("Zoltán");
        names.add("Béla");
        names.add("Lajos");
        names.add("István");
        names.add("Géza");
        names.add("András");

        Random random = new Random();
        System.out.println("A két nyertes: " + names.get(random.nextInt(5)) + " és " + names.get(random.nextInt(5)+5));
    }
}
