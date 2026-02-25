package logical;

import java.util.Arrays;

public class MoveAllZerosAtLast {
    public static void main(String[] args) {
        int[] arr = {10,0,22,8,0,5,0};
        int nz=0,z=0,n=arr.length;

        if(arr.length<=1)
            return;
        while(nz<n){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz++]=arr[z];
                arr[z++]=temp;
            }else{
                nz++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
