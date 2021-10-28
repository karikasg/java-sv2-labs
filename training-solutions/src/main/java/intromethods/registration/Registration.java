package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        String surname;
        String givenName;
        int year;
        int month;
        int day;
        String email;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a vezetéknevet: ");
        surname = scanner.nextLine();
        System.out.print("Kérem a keresztnevet: ");
        givenName = scanner.nextLine();
        System.out.print("Kérem a születési évet: ");
        year = scanner.nextInt();
        System.out.print("Kérem a születési hónapot: ");
        month = scanner.nextInt();
        System.out.print("Kérem a születési napot: ");
        day = scanner.nextInt();scanner.nextLine();
        System.out.print("Kérem az email címet: ");
        email = scanner.nextLine();

        Person person = new Person(registration.fullName(surname, givenName), LocalDate.of(year, month, day), email);
        System.out.println(person);

    }

    public String fullName (String surname, String givenName){
        return surname + " " + givenName;
    }
}
