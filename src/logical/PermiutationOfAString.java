package logical;

import java.util.HashSet;
import java.util.Set;

public class PermiutationOfAString {
    public static void main(String[] args) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        permutatins(charArray,0);
    }

    private static void permutatins(char[] ca, int fi) {
        if(fi==ca.length-1){
            System.out.println(ca);
            return;
        }
        Set<Character> set = new HashSet<>();

        for(int i = fi; i<ca.length;i++){
            if (set.contains(ca[i])) continue;
            set.add(ca[i]);
            swap(ca,fi,i);
            permutatins(ca,fi+1);
            swap(ca,fi,i);
        }
    }

    private static void swap(char[] ca, int fi, int i) {
        char temp= ca[fi];
        ca[fi]=ca[i];
        ca[i]=temp;
    }
}
