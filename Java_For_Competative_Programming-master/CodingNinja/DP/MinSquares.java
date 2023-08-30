package CodingNinja.DP;

import java.util.Arrays;
import java.util.Scanner;

public class MinSquares {
    public static int minSquares(int n, int[] dp) {
        if (n == 0) return 0;

        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int currentValue;
            if (dp[n - (i * i)] == -1) {
                currentValue = minSquares(n - (i * i), dp);
                dp[n - (i * i)] = currentValue;
            } else {
                currentValue = dp[n - (i * i)];
            }

            if (minValue > currentValue) {
                minValue = currentValue;
            }
        }

        return minValue + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        int ans = minSquares(n, dp);

        System.out.println("Answer -> " + ans);
    }
}
