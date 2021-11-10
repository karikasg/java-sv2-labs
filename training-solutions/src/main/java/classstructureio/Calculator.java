package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első összeadandót: ");
        int nr1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az második összeadandót: ");
        int nr2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(nr1 + " + " + nr2);
        System.out.println(nr1 + nr2);
    }
}
