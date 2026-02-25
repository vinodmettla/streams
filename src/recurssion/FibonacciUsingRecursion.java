package recurssion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.print(fibonacci(10) );
    }

    public static int fibonacci(int n) {
       if(n<=1)
           return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }
}
