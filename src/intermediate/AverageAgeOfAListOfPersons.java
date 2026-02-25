package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAgeOfAListOfPersons {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John",25,1),
                new Person("Bob",30,2),
                new Person("Mark",22,3),
                new Person("Perry",31,4),
                new Person("Alice",40,5),
                new Person("Tom",28,6)
        );

        OptionalDouble average = personList.stream().mapToInt(Person::getAge).average();
        System.out.println(average);
    }
}
