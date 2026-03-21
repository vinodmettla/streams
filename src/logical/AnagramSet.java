package logical;

import java.util.*;

public class AnagramSet {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<List<String>> anagramSets = findAnagramSets(arr);
        System.out.println(anagramSets);
    }

    private static ArrayList<List<String>> findAnagramSets(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : arr){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
//        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
