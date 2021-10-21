package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        int hour;
        int minute;
        int second;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem az első időpontot: óra: ");   // hogy lehet az időbekérést nem leírni kétszer?
        hour = scanner.nextInt();
        System.out.print(" perc: ");
        minute = scanner.nextInt();
        System.out.print(" másodperc: ");
        second = scanner.nextInt();
        Time time1 = new Time(hour, minute, second);

        System.out.print("Kérem a második időpontot: óra: ");
        hour = scanner.nextInt();
        System.out.print(" perc: ");
        minute = scanner.nextInt();
        System.out.print(" másodperc: ");
        second = scanner.nextInt();
        Time time2 = new Time(hour, minute, second);

        System.out.println("Az első időpont: " + time1.toString() + " = " + time1.getInMinutes());
        System.out.println("A mádosik időpont: " + time1.toString() + " = " + time1.getInSeconds());
        System.out.println("Az első időpont " + (time1.earlierThan(time2) ? "" : "nem ") + "korábbi, mint a második.");
    }

}
