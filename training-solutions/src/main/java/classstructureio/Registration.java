package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a nevét: ");
        String name = scanner.nextLine();
        System.out.print("Kérem az email címét: ");
        String email = scanner.nextLine();
        System.out.println("\nÖn az alábbi adatokkal regisztrált: ");
        System.out.println("Név: " + name + ", Email: " + email);
    }
}