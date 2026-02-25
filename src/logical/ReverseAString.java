package logical;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "powerful";

        char[] charArray = str.toCharArray();
        int l=0,r=charArray.length-1;

        while(l<r){
            char temp = charArray[l];
            charArray[l]=charArray[r];
            charArray[r]=temp;
            l++;
            r--;
        }

        System.out.println(String.valueOf(charArray));
    }
}
