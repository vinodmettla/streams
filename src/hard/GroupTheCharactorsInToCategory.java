package hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheCharactorsInToCategory {

    private enum CharChategory{
        LOWERCASE,
        UPPERCASE,
        DIGIT,
        OTHER
    }
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('A','b','2','Z','@','v');

        Map<Object, List<Character>> collect = list.stream().collect(
                Collectors.groupingBy(
                        c -> getCharCatogory(c)
                )
        );
        System.out.println(collect);
    }

    private static Object getCharCatogory(Character c) {
        if(Character.isLowerCase(c))
            return CharChategory.LOWERCASE;
        if (Character.isUpperCase(c))
            return CharChategory.UPPERCASE;
        if (Character.isDigit(c))
            return CharChategory.DIGIT;
        else
            return CharChategory.OTHER;
    }
}
