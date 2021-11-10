package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String name;
        int price;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a termék megnevezését: ");
        name = scanner.nextLine();
        System.out.print("Kérem a termék kiinduló árát: ");
        price = scanner.nextInt();scanner.nextLine();
        Product product = new Product(name, price);
        System.out.println("Az alábbi terméket regisztráltuk:  név: " + product.getName() + ", ára: " + product.getPrice());
        System.out.print("\nMennyivel növeljük az árat? ");
        product.increasePrice(scanner.nextInt());scanner.nextLine();
        System.out.println("A termék új adatai:  név: " + product.getName() + ", ára: " + product.getPrice());
        System.out.print("\nMennyivel csökkentsük az árat? ");
        product.decreasePrice(scanner.nextInt());scanner.nextLine();
        System.out.println("A termék új adatai:  név: " + product.getName() + ", ára: " + product.getPrice());
    }
}
