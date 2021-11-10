package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Béla", "12345");
        System.out.println(person.personToString());
        person.correctData("Béla", "54321");
        System.out.println(person.personToString());
        person.moveTo(new Address( "Hungary", "Budapest", "Ó utca 3.", "1234"));
        System.out.println(person.getAddress().addressToString());
        person.getAddress().correctData("New Zealand", "Auckland", "Lynch str. 1.", "1022");
        System.out.println(person.personToString() + ", " + person.getAddress().addressToString());
    }
}
