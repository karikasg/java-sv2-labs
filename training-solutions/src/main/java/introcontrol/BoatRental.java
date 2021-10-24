package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int people;
        int capacity = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány vendég érkezett? ");
        people = scanner.nextInt();

        if (people > 3){
            System.out.println("5 fős csónak kiadva");
            people -= 5;
            capacity -= 5;
        }
        if (people > 2){
            System.out.println("3 fős csónak kiadva");
            people -= 3;
            capacity -= 3;
        }
        if (people > 0){
            System.out.println("2 fős csónak kiadva");
            people -= 2;
            capacity -= 2;
        }
        if (people > 0){
            System.out.println("Sajnos maradtak még a parton");
        }
        else {
            System.out.println("Még maximum " + capacity + " fő mehet utánuk");
        }
    }
}
