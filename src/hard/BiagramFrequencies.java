package hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiagramFrequencies {
    //pair of consecutive words
    public static void main(String[] args) {
        String paragraph = "Java is great and java is fun. java is powerful!";

        String[] s = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ");

        Map<String, Long> map = IntStream.range(0, s.length - 1)
                .mapToObj(i -> s[i] + " " + s[i + 1])
                .toList().stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(map);
    }
}
