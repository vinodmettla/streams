package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,4,1,5};

        for(int i = 0; i<arr.length;i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[smallest])
                     smallest = j;
            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
