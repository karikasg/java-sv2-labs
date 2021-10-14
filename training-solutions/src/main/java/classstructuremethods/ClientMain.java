package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        client.setName("Karikás Gábor");
        client.setAddress("Budapest");
        client.setYear(1968);
        System.out.println("Név: "+client.getName()+", Cím: "+client.getAddress()+", Szül.év: "+client.getYear());
        System.out.print("Kérem az új címet: ");
        client.migrate(scanner.nextLine());
        System.out.println(client.getName()+" költöztetése sikerrel lezajlott a "+client.getAddress()+" címre.");
    }
}
