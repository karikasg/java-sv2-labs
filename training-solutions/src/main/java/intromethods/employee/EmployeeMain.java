package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("János", 2010, 350000);

        System.out.println(employee);
        employee.raiseSalary(40000);
        System.out.println(employee);
    }
}
