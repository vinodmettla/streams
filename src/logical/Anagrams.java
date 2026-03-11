package logical;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        boolean result = check(str1,str2);
        System.out.println(result);
    }

    private static boolean check(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;

        Map<Character,Integer> str1Map = new HashMap<>();
        Map<Character,Integer> str2Map = new HashMap<>();

        for(int i= 0; i<str1.length();i++){
            str1Map.put(str1.charAt(i),str1Map.getOrDefault(str1.charAt(i),0)+1);
            str2Map.put(str2.charAt(i),str2Map.getOrDefault(str2.charAt(i),0)+1);
        }
        return str1Map.equals(str2Map);
    }
}
