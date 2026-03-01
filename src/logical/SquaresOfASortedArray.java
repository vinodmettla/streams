package logical;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = new int[arr.length];
        int l =0, r =arr.length-1, index =arr.length-1;

        while(l<r){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                result[index]=arr[l]*arr[l];
                l++;
            }else{
                result[index]=arr[r]*arr[r];
                r--;
            }
            index--;
        }

        System.out.println(Arrays.toString(result));
    }
}
