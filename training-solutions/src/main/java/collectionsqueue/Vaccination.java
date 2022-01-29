package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        PriorityQueue<Integer> ages = new PriorityQueue<>();
        int age;
        for (Person p : people) {
            age = p.getAge();
            if (age >= 18 && age <= 65) {
                ages.add(age);
            }
        }
        return ages;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Béla", 45));
        persons.add(new Person("Géza", 23));
        persons.add(new Person("Jani", 80));
        persons.add(new Person("Józsi", 16));
        persons.add(new Person("Gizi", 65));
        persons.add(new Person("Zsolti", 18));
        persons.add(new Person("Zoli", 26));

        Queue<Integer> result = vaccination.getVaccinationOrder(persons);
        System.out.println(result);
        System.out.println(result.poll());
        System.out.println(result.poll());
        System.out.println(result.poll());
        System.out.println(result.poll());
        System.out.println(result.poll());
    }
}
