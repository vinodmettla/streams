package logical;

import java.util.Arrays;

public class RotateAnArrayKTimes {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k =  3, n=arr.length-1;
        k=k%arr.length;
        rotate(arr,0,n-k); //upto k-1 for leftshift
        rotate(arr,n-k+1,n);//from k to n for leftshift
        rotate(arr,0,n);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotate(int[] arr, int start, int end) {
        while (start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
