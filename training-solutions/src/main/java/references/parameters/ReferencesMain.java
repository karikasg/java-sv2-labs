package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("Béla", 29);
        Person person2 = new Person("Géza", 92);
        person1 = new Person("Jani", 35);
        person2 = person1; // innentől a két objektum "ugyanaz", mivel a referenciájuk megegyezik
        person2.setName("Pisti");
        System.out.println(person1);
        System.out.println(person2);

        int integer1;
        int integer2;
        integer1 = 24;
        integer2 = integer1;
        integer2++;
        System.out.println(integer1);
        System.out.println(integer2);

        person1 = new Person("Józsi", 54);
        System.out.println(person1);
        System.out.println(person2);
    }
}
