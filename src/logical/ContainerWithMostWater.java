package logical;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int l =0, r = a.length-1, maxArea = 0;

        while (l<r){
            int currArea = Math.min(a[l],a[r])*(r-l);
            maxArea = Math.max(currArea,maxArea);

            if(a[l]>a[r])
                r--;
            else
                l++;
        }

        System.out.println(maxArea);
    }
}
