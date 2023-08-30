package SourceCode.Recursion_09.BasicOfRecursion.Questions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int ans = fibo2(10);
        System.out.println(ans);
    }
    static int fibo(int n) {
//        Base Condition
        if (n < 2) return n;

        return fibo(n - 1) + fibo(n - 2);
    }

    static int fibo2(int n) {
        if ( n == 1 || n == 2) {
            return 1;
        }

        int fib_1 = fibo2(n - 1);
        int fib_2 = fibo2(n - 2);

        return fib_1 + fib_2;
    }
}
