package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {


    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student s : students) {
            heights.add(s.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Béla", 170));
        students.add(new Student("Józsi", 172));
        students.add(new Student("Géza", 161));
        students.add(new Student("Jani", 164));
        students.add(new Student("Misi", 163));

        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
