package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithMoreThan2Employees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(2,"Bob",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(5,"Perry",45000.00,"Finance"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(6,"Tom",45000.00,"Management")
        );

        List<String> list = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
    }
}
