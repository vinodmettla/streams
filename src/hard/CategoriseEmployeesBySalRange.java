package hard;

import intermediate.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoriseEmployeesBySalRange {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(2,"Bob",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(5,"Perry",45000.00,"Finance"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(6,"Tom",45000.00,"Management")
        );

        Map<SalaryRange, List<Employee>> collect = employees.stream().collect(
                Collectors.groupingBy(
                        e -> {
                            return getSalaryRange(e.getSalary());
                        }
                )
        );

        System.out.println(collect);
    }

    private static SalaryRange getSalaryRange(Double s) {
        if (s < 50000.00) return SalaryRange.LOW;
        if (s < 100000.00) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
}
