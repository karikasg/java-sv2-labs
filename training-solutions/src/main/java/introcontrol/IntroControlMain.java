package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(123));
        System.out.println(introControl.subtractTenIfGreaterThanTen(3));

        System.out.println(introControl.describeNumber(23));
        System.out.println(introControl.describeNumber(0));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jim"));

        System.out.println(introControl.calculateBonus(1234567));
        System.out.println(introControl.calculateBonus(123456));

        System.out.println(introControl.calculateConsumption(123, 456));
        System.out.println(introControl.calculateConsumption(1234, 456));
        System.out.println(introControl.calculateConsumption(9998, 2));

        introControl.printNumbers(4);
        introControl.printNumbersBetween(5, 8);
        introControl.printNumbersBetweenAnyDirection(9, 12);
        introControl.printNumbersBetweenAnyDirection(11, 8);
        introControl.printOddNumbers(5);
        introControl.printOddNumbers(6);
    }
}
