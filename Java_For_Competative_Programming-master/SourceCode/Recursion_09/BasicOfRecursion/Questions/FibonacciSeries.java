package SourceCode.Recursion_09.BasicOfRecursion.Questions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }

    static int fibo(int n) {
//        Base Condition
        if (n < 2) return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}
