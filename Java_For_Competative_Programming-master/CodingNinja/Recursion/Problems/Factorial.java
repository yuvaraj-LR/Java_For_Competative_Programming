package CodingNinja.Recursion.Problems;

public class Factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * (fact(n - 1));
    }

    public static void fact1(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        ans = ans * n;
        System.out.println(ans);
        fact1(n - 1, ans);
    }

    public static void main(String[] args) {

         fact1(5, 1);
    }
}
