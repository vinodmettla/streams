package logical;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcaaabbdd";
        System.out.println(compression(str));
    }

    private static String compression(String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i<str.length()){
            int count = 0;
            char c = str.charAt(i);
            while(i<str.length() && str.charAt(i)==c){
                count++;
                i++;
            }

            if (count>1){
                sb.append(c).append(count);
            }else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
