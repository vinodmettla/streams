package logical;

public class RainWaterTrapping {
    public static void main(String[] args) {

        int[] a = {3,0,0,2,0,4};
        int l = 0, r = a.length-1, lmax = 0, rmax = 0, water = 0;

        while (l<r){
            if(a[l]<a[r]){
                lmax = Math.max(a[l],lmax);
                water+=lmax-a[l];
                l++;
            }
            if(a[l]>a[r]){
                rmax = Math.max(a[r],rmax);
                water+=rmax-a[r];
                r++;
            }

        }

        System.out.println(water);
    }
}
