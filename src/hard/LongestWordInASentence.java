package hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWordInASentence {
    public static void main(String[] args) {
        String s = "The quick, brown fox jumped over the lazy dog!";

        Optional<String> max = Arrays.stream(
                s.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).max(Comparator.comparing(String::length));
        System.out.println(max);
    }
}
