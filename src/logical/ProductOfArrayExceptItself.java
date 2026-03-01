package logical;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
        int[] result2 = productExceptSelfOptimal(nums);
        System.out.println(Arrays.toString(result2));
    }

    private static int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(n==1){
            return  new int[]{0};
        }
        if(n==0){
            return  new int[]{};
        }

        int leftProduct = 1;
        for(int i = 0; i<n;i++){
            result[i]= leftProduct;
            leftProduct=leftProduct*nums[i];
        }

        int rightProduct=1;
        for(int i = n-1; i>=0; i--){
            result[i]*= rightProduct;;
            rightProduct*=nums[i];
        }

        return result;
    }

    private static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];
        for(int i = 0; i<n;i++){
            int prod = 1;
            for(int j = 0; j<n;j++){
                if(i!=j){
                    prod *= nums[j];
                }
            }
            result[i] = prod;
        }
        return result;
    }

}
