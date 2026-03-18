package logical;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(checkDuplicatearr(arr));
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
