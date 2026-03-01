package logical;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int l =0, r = a.length-1, maxArea = 0;

        while (l<r){
            int currArea = Math.min(a[l],a[r])*(r-l);
            maxArea = Math.max(currArea,maxArea);

            if(a[l]<a[r])
                //Height is still limited by x → area cannot improve.
                //So moving right pointer is useless.
                //Only hope is moving left pointer to find taller height:
                l++;
            else
                r--;
        }

        System.out.println(maxArea);
    }
}
