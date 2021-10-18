package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        String ownerName;
        String accountNumber;
        int balance;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a tulajdonos nevét: ");
        ownerName = scanner.nextLine();
        System.out.print("Kérem a számlaszámot: ");
        accountNumber = scanner.nextLine();
        System.out.print("Kérem a nyitó összeget: ");
        balance = scanner.nextInt();scanner.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber, ownerName, balance);
        System.out.println("Az alábbi számlát regisztráltuk: "+bankAccount.getInfo());

        System.out.print("\nMekkora összeget teszünk be? ");
        bankAccount.deposit(scanner.nextInt());scanner.nextLine();
        System.out.println("A számla új adatai: "+bankAccount.getInfo());

        System.out.print("\nMekkora összeget veszünk ki? ");
        bankAccount.withdraw(scanner.nextInt());scanner.nextLine();
        System.out.println("A számla új adatai: "+bankAccount.getInfo());
    }
}
