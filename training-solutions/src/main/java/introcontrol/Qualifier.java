package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        int nr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        nr = scanner.nextInt();
        if (nr > 100){
            System.out.println("Nagyobb, mint száz");
        }
        else {
            System.out.println("Száz, vagy kisebb");
        }
    }
}
