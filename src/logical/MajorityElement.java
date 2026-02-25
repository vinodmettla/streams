package logical;

public class MajorityElement {
    public static void main(String[] args) {
        //element which occurs more than n/2 times
        int[] nums = {3,2,3};

        int candidate = nums[0],count=1;
        for (int i = 1; i<nums.length;i++){
            if (nums[i]!=candidate){
                count--;
                if (count==0){
                    candidate=nums[i];
                    count=1;
                }
            }else
                count++;
        }

        System.out.println(candidate);


    }
}
