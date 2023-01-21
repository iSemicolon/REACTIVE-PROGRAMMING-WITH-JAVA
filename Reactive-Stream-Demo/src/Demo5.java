import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String firstName;
    String lastName;
    int age;
    int salary;
    int experience;

    public Employee(int empId, String firstName, String lastName, int age, int salary, int experience) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Mark", "Smith", 30, 5000, 3),
                new Employee(2, "Paul", "Smith", 35, 5000, 5),
                new Employee(3, "Watson", "Smith", 32, 5000, 9),
                new Employee(4, "John", "Smith", 28, 5000, 6),
                new Employee(5, "Rangel", "Smith", 40, 5000, 8)
        );

        List<String> promotedEmployee = employeeList
                .stream()
                .filter(employee -> employee.experience > 5)
                .map(employee -> "Promoted - "+ employee.firstName)
                .collect(Collectors.toList());

        System.out.println(promotedEmployee);

    }
}
