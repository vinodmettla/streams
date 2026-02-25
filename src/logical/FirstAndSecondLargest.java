package logical;

public class FirstAndSecondLargest {
    public static void main(String[] args) {
        int[] a = {10,23,12,19,45,89,89,64};

        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for( int i : a){
            if(i>firstMax){
                secondMax=firstMax;
                firstMax=i;
            }
            if(i>secondMax && i!=firstMax){
                secondMax = i;
            }
        }

        System.out.println(firstMax +":"+secondMax);
    }
}
