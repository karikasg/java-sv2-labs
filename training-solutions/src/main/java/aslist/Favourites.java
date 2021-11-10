package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {  // megnézve a megoldást, kicsit félreértettem a feladatot
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a kedvenc könyveidet (kilépés: \"x\"): ");
        String input = scanner.nextLine();
        while (!"x".equals(input)){
            favouriteThings.add(input);
            System.out.print("Következő könyv: (kilépés: \"x\"): ");
            input = scanner.nextLine();
        }
        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
