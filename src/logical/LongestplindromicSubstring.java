package logical;

public class LongestplindromicSubstring {
    int resultStart;
    int resultLegth;

    public String longestPalindrome(String s){
        int n = s.length();
        if(n<2){
            return  s;
        }

        for(int start = 0; start<n; start++){
            expandRange(s,start,start);
            expandRange(s,start,start+1);
        }
        return s.substring(resultStart,resultStart+resultLegth);
    }

    private void expandRange(String s, int start, int end) {
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        if(resultLegth<end-start-1){
            resultStart=start+1;
            resultLegth=end-start-1;
        }
    }

    public static void main(String[] args) {
        LongestplindromicSubstring l = new LongestplindromicSubstring();
        System.out.println(l.longestPalindrome("abcabcabcbad"));
    }
}
