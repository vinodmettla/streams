package logical;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2,6,3,7,11,15};
        int targer = 9;
        int[] extracted = extracted(arr, targer);
        System.out.println(Arrays.toString(extracted));
    }

    private static int[] extracted(int[] arr, int targer) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            int complement = targer - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
