package hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3FrequentWords {
    public static void main(String[] args) {
        String s = "Java is great. Java is objectoriented. Java streams are powerful, and java is fun!";
//        List<Map.Entry<String, Long>> list = Arrays.stream(
//                        s.toLowerCase()
//                                .replaceAll("[^a-z\\s]", "")
//                                .split(" ")
//                ).collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                )).entrySet().stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//                .limit(3)
//                .toList();

        Map<String, Long> map = Arrays.stream(
                s.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);

        List<Map.Entry<String, Long>> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();

        System.out.println(sorted);

        List<Long> frequency = sorted.stream().map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();

        System.out.println(frequency);

        List<Map.Entry<String, Long>> list = sorted.stream().filter(e -> frequency.contains(e.getValue())).toList();

        System.out.println(list);
//        System.out.println(list);
    }
}
