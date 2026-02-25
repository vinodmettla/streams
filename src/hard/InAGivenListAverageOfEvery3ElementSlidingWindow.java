package hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InAGivenListAverageOfEvery3ElementSlidingWindow {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int window = 3;

        List<Double> list1 = IntStream.range(0, (list.size() - window - 1))
                .mapToObj(i -> list.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)).toList();

        System.out.println(list1);
    }
}
