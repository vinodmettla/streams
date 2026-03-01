package logical;

public class MajorityElement1 {
    public static void main(String[] args) {
        int a[] = {2, 2, 1, 1, 1, 2, 2};
        int count = 1, candidate = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = a[i];
                count = 1;
            }
        }

        System.out.println(candidate);
    }
}
