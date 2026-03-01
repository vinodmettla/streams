package logical;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedSubString {
    public static void main(String[] args) {
        String str = "naveen";
        int start = 0, end = 0,maxLength=0, startIndex=0;
        Map<Character,Integer> map = new HashMap<>();

        for( end = 0; end<str.length(); end++){
            char c = str.charAt(end);
            if(map.containsKey(c)){
                start = Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
//            maxLength=Math.max(maxLength,end-start+1);

            if(end-start+1 >maxLength){
                maxLength=end-start+1;
                startIndex=start;
            }
        }

        System.out.println(maxLength);
        System.out.println(str.substring(startIndex,startIndex+maxLength));
    }
}
