public class Fibonacci_series {
    static int fibo(int n) {
        // Using Recursion
        if(n == 1 || n == 2) {
            return n - 1;
        }
        else {
            return fibo(n-2) + fibo(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
}
