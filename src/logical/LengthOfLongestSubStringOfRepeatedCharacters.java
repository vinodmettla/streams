package logical;

public class LengthOfLongestSubStringOfRepeatedCharacters {
    public static void main(String[] args) {
        String s = "aabbbc";
        int count = 1, max = 1;
        char ch = 0;
        
        for( int i = 1; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max = Math.max(count,max);
                ch=s.charAt(i);
            }else
                count = 1;
        }

        System.out.println( ch +":"+max);
    }
}
