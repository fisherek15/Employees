package best.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee tom = new Employee("Tom Trimmer", 30);
        Employee lisa = new Employee("Lisa Adele", 21);
        Employee adrian = new Employee("Adrian Hummer", 40);
        Employee andrea = new Employee("Andrea Still", 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(tom);
        employees.add(lisa);
        employees.add(adrian);
        employees.add(andrea);

//        System.out.println("Employees over 30:");
//        System.out.println("==================");
//        employees.forEach(employee -> {
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName());
//            }
//        });
//
//        System.out.println("\nEmployees 30 and younger:");
//        System.out.println("===========================");
//        employees.forEach(employee -> {
//            if(employee.getAge() <= 30){
//                System.out.println(employee.getName());
//            }
//        });

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);
    }

    public static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("==================");
        for(Employee employee : employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
