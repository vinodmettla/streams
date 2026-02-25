package hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInASentence {
    public static void main(String[] args) {
        String s = "Java streams are powerful";

        String collect = Arrays.stream(s.split(" "))
                .map(w -> new StringBuffer(w).reverse())
                .collect(Collectors.joining(" "));

        String collect1 = Arrays.stream(s.split(" "))
                .map(w -> Arrays.stream(w.split(""))
                        .reduce("", (a, b) -> b + a))
                .collect(Collectors.joining(" "));

        System.out.println(collect1);
    }
}
