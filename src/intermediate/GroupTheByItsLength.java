package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheByItsLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "cat","dog","grapes","orange","train","apple","cat","dog");

        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

    }
}
