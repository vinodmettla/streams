package intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmpInEachDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(2,"Bob",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(5,"Perry",45000.00,"Finance"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(6,"Tom",45000.00,"Management")
        );

        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println(collect);
    }
}
