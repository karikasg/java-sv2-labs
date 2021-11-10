package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        //Student student = new Student();
        students.add(new Student("Karikás Gábor"));
        students.add(new Student("Kiss Csaba"));
        students.add(new Student("Kovács István"));
        students.add(new Student("Nagy Ádám"));
        students.add(new Student("Kishonthy Boglárka"));
        students.add(new Student("Havasi Bertalan"));

        for (Student student : students){
            System.out.println(student.getName() + ", " + (student.isActive() ? "aktív" : "inaktív"));
        }
        System.out.println();

        students.get(1).setActive(false);
        students.get(3).setActive(false);
        students.get(5).setActive(false);

        for (Student student : students){
            System.out.println(student.getName() + ", " + (student.isActive() ? "aktív" : "inaktív"));
        }
        System.out.println();

        for (int i=0; i<students.size(); i++){
            if (!students.get(i).isActive()){
                students.remove(i);
            }
        }
        for (Student student : students){
            System.out.println(student.getName() + ", " + (student.isActive() ? "aktív" : "inaktív"));
        }
        System.out.println(students.size());
    }
}
