package logical;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr ={-1,3,4,-2};

        int sum = findMaxSum(arr);
        System.out.println(sum);
        int sum2 = findMaxSumOptimal(arr);
        System.out.println(sum2);
    }

    //kadane's algo (marvadi community)
    private static int findMaxSumOptimal(int[] arr) {
        int sum = arr[0],maxSum=arr[0];
        for(int i= 1; i<arr.length;i++){
            if(sum>=0)
                sum+=arr[i];
            else
                sum=arr[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    private static int findMaxSum(int[] arr) {

        int maxSum=0;

        for(int i =0; i<arr.length-1;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

}
