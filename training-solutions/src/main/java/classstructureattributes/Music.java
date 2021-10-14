package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Song favoriteSong = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a kedvenc zeneszámának előadóját: ");
        favoriteSong.band = scanner.nextLine();
        System.out.print("Kérem a kedvenc zeneszámának címét: ");
        favoriteSong.title = scanner.nextLine();
        System.out.print("Kérem a zeneszám hosszát: ");
        favoriteSong.length = scanner.nextInt();
        System.out.println("\nAz Ön kedvenc zeneszáma: ");
        System.out.println(favoriteSong.band + " - " + favoriteSong.title + " (" + favoriteSong.length + " perc)");

    }

}
