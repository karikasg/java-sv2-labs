package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek 5 számot!");
        for (int i = 1; i<=5; i++){
            System.out.print(i + ".: ");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Az 5 szám összege: " + sum);
    }
}
