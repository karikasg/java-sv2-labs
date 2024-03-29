package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

//    public Employee(String name, LocalDate dateOfBirth, LocalDateTime beginEmployment) {
//        this.name = name;
//        this.dateOfBirth = dateOfBirth;
//        this.beginEmployment = beginEmployment;
//    }

    public Employee(int year, int month, int day, String name){
        this.name = name;
        dateOfBirth = LocalDate.of(year, month, day);
        beginEmployment = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }
}
