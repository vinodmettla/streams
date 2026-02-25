package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurance   {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grapes","orange","apple","banana","banana");

        Map<String, Long> collect = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}
