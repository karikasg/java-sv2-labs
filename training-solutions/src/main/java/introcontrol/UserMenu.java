package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása\n2. Felhasználó felvétele\nTöbbi: Kilépés");
        int opt = scanner.nextInt();
        if (opt == 1){
            System.out.println("Felhasználók listázása");
        }
        else if (opt == 2){
            System.out.println("Felhasználó felvétele");
        }
    }
}
