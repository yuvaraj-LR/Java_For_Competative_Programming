package CodingNinja.Recursion.Problems;

public class SumOfN {
    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return (n + sumOfN(n - 1));
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("The sum of " + num + " is " + sumOfN(num));
    }
}
