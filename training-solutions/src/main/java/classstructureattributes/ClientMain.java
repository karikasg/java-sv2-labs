package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a nevét: ");
        client.name = scanner.nextLine();
        System.out.print("Kérem a születési évét: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kérem a címét: ");
        client.address = scanner.nextLine();
        System.out.println("\nÖn az alábbi adatokkal regisztrált: ");
        System.out.println("Név: " + client.name + ", Szül.év: " + client.year + ", Cím: " + client.address);

    }
}
