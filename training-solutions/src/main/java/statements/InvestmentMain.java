package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        int fund;
        int rate;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a befektetett összeget: ");
        fund = scanner.nextInt();
        System.out.print("Kérem a kamatábat: ");
        rate = scanner.nextInt();

        Investment investment = new Investment(fund,rate);
        System.out.println("\nTőke: " + investment.getFund() + " Ft");

        System.out.println("\nHozam 50 napra: " + investment.getYield(50) + " Ft");
        System.out.println("\nKivett összeg 80 nap után: " + investment.close(80) + " Ft");
        System.out.println("\nKivett összeg 90 nap után: " + investment.close(90) + " Ft");
    }
}
