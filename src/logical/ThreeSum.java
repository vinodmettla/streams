package logical;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        System.out.println(calculateTriplets(arr));
    }

    private static Set<List<Integer>> calculateTriplets(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();
        for(int i= 0; i < arr.length-2; i++){
            int j = i+1;
            int k = arr.length-1;

            while (j<k){
                ArrayList<Integer> list = new ArrayList<>();
                int sum = arr[i] + arr[j] + arr[k];
                if(sum==0){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    j++;
                    k--;
                    result.add(list);
                }else if(sum>0){
                    k--;
                }else {
                    j++;
                }
            }
        }

        return result;
    }
}
