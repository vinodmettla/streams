package hard;

import intermediate.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWith3Dept {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(1,"John",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(3,"Mark",70000.00,"Finance"),
                new Employee(3,"Mark",70000.00,"Management"),
                new Employee(5,"Perry",45000.00,"Finance"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(1,"John",45000.00,"Management")
        );

        List<String> list = employees.stream().collect(
                        Collectors.groupingBy(
                                Employee::getName
                        )
                ).entrySet().stream()
                .filter(e -> e.getValue().size() >= 3)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
    }
}
