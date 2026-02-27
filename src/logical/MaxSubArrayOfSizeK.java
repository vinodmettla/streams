package logical;

public class MaxSubArrayOfSizeK {
    public static void main(String[] args) {
        int a[] = {2,9,31,-4,21,7};
        int k = 3;
        int sum = maxSubArray(a,k);
        System.out.println(sum);
    }

    private static int maxSubArray(int[] a, int k) {

        int maxSum=Integer.MIN_VALUE;
        int wSum=0;

        for(int i= 0; i<k;i++){
            wSum+=a[i];
        }

        for(int i=k;i<a.length;i++){
            wSum = wSum-a[i-k]+a[i];
            maxSum=Math.max(wSum,maxSum);
        }

        return maxSum;
    }
}
