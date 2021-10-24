package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        String name;
        int yearOfBirth;
        int monthOfBirth;
        int dayOfBirth;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem az alkalmazott nevét: ");
        name = scanner.nextLine();
        System.out.print("Kérem a születési évet: ");
        yearOfBirth = scanner.nextInt();scanner.nextLine();
        System.out.print("Kérem a születési hónapot: ");
        monthOfBirth = scanner.nextInt();scanner.nextLine();
        System.out.print("Kérem a születési napot: ");
        dayOfBirth = scanner.nextInt();scanner.nextLine();

        Employee employee = new Employee(yearOfBirth, monthOfBirth, dayOfBirth, name);

        System.out.println("Az alkalmazott adatai:");
        System.out.println("Név: " + employee.getName());
        System.out.println("Születési ideje: " + employee.getDateOfBirth());
        System.out.println("Alkalmazás kezdete: " + employee.getBeginEmployment());
    }
}
