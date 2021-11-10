package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students){
        for (String student : students){
            System.out.println(student + ((student.length()>10) ? " 2. csoport" : " 1. csoport"));
        }
    }

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> students = Arrays.asList("Kiss István", "Nagy Zsolt", "Kishonthy Boglárka", "Karikás Gábor", "Oh Martin");
        studyGroup.printStudyGroups(students);
    }

}
