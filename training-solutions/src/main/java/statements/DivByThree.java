package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        number = scanner.nextInt();
        System.out.println("A szám " + ((number % 3 == 0) ? "" : "nem ") + "osztható 3-mal");
    }
}
