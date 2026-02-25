package hard;

import intermediate.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John",50000.00,"Finance"),
                new Employee(2,"Annie",150000.00,"IT"),
                new Employee(3,"Mark",70000.00,"IT"),
                new Employee(5,"Perry",45000.00,"Finance"),
                new Employee(4,"Alice",82000.00,"IT"),
                new Employee(6,"Tom",45000.00,"Management")
        );
        Optional<Map.Entry<Character, Long>> max = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getName().charAt(0),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max.get());
    }
}
