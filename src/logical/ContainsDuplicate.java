package logical;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(checkDuplicatearr(arr));
        System.out.println(ckeckDuplicates("abcfda"));
    }

    private static boolean ckeckDuplicates(String str) {
        int[] count = new int[256];
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            count[c]++;

            if(count[c]>1)
                return true;
        }
        return false;
    }

    private static boolean checkDuplicatearr(int[] a) {
        HashSet<Integer> set = new HashSet<>();
       for( int i: a){
           if(set.contains(i))
               return true;
           set.add(i);
       }
       return false;
    }

}
