package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class SortTheEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(2,"Bob",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(5,"Perry",45000.00,"Financ"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(6,"Tom",45000.00,"Management")
        );

        List<Employee> list = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(list);

        List<Employee> list1 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getName)).toList();
        System.out.println(list1);

        OptionalDouble average = employees.stream().mapToDouble(Employee::getSalary).average();
        System.out.println(average);
    }
}
