package logical;

public class IncreasingTripletsSubsequence {
    //greedy problem statement
    public static void main(String[] args) {
        int[] nums = {6,2,3,4,5};
        System.out.println(increasingTriplects(nums));
    }

    private static boolean increasingTriplects(int[] nums) {
        int first = Integer.MAX_VALUE, second =Integer.MAX_VALUE;

        for( int num : nums){
            if(num<first)
                first=num;
            else if (num<second)
                second = num;
            else
                return true;
        }
        return false;
    }
}
