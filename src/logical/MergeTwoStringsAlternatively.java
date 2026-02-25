package logical;

public class MergeTwoStringsAlternatively {
    public static void main(String[] args) {
        String str1="abc",str2="pqr";
        int p1=0,p2=0;
        StringBuilder sb = new StringBuilder();

        while(p1<str1.length()&&p2<str2.length()){
            sb.append(str1.charAt(p1++));
            sb.append(str2.charAt(p2++));
        }

        while (p1<str1.length()){
            sb.append(str1.charAt(p1++));
        }

        while (p2<str2.length()){
            sb.append(str2.charAt(p2++));
        }

        System.out.println(sb);
    }
}
