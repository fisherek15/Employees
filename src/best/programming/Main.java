package best.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee tom = new Employee("Tom Trimmer", 30);
        Employee lisa = new Employee("Lisa Adele", 21);
        Employee adrian = new Employee("Adrian Hummer", 40);
        Employee andrea = new Employee("Andrea Still", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(tom);
        employees.add(lisa);
        employees.add(adrian);
        employees.add(andrea);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }
}
