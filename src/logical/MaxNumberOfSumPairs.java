package logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfSumPairs {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,3,9,8,7};
        int k = 10;
        System.out.println(pairs(arr,k));
        //if sorting is allowed
        Arrays.sort(arr);
        System.out.println(calculatePairsUsing2Pointers(arr,k));;
    }

    private static int calculatePairsUsing2Pointers(int[] arr, int k) {
        int l=0,r=arr.length-1,count = 0;
        while (l<r){
            if(arr[l]+arr[r]==k){
                count++;
                l++;
                r--;
            } else if (arr[l]+arr[r]>k) {
                r--;
            }else {
                l++;
            }
        }
        return count;
    }

    private static int pairs(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : arr){
            int target = k-num;
            if(map.getOrDefault(target,0) >0){
                count++;
                //we dont use the same pair again
                map.put(target,map.get(target)-1);
            }else {
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return count;
    }

}
