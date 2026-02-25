package logical;

public class GCD {
    //using euclidean algo
    public static void main(String[] args) {
        int a =18,b=12;
        String str2 = "abcabc", str1 ="abc";
        int x = str1.length(), y = str2.length();
        int i = calculateGCD(x, y);
        System.out.println(str1.substring(0,i));
        System.out.println(calculateGCD(a,b));;
    }

    private static int calculateGCD(int a, int b) {

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

}
