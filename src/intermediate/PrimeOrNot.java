package intermediate;

import java.util.stream.IntStream;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 15;

        boolean b = IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);

        System.out.println("Is prime :"+b);
    }
}
