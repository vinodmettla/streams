package logical;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        int[] sorted = sort(arr1,arr2);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sort(int[] arr1, int[] arr2) {

        int i =0,k =0, j=0;
        int[] sorted = new int[arr1.length+arr2.length];

        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]>arr2[j])
                sorted[k++] = arr2[j++];
            else
                sorted[k++] = arr1[i++];
        }

        while (i<arr1.length){
            sorted[k++]=arr1[i++];
        }

        while (j<arr2.length){
            sorted[k++]=arr2[j++];
        }

        return sorted;
    }
}
