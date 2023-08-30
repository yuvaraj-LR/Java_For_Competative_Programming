package CodingNinja.DP;

import java.util.Arrays;
import java.util.Scanner;

public class MinStepsTo1 {

    public static int minStepsTo1(int n) {
        if (n == 1) return 0;

        int ans1 = minStepsTo1(n - 1);

        int ans2 = Integer.MAX_VALUE;
        if ((n % 2) == 0) {
            ans2 = minStepsTo1(n / 2);
        }

        int ans3 = Integer.MAX_VALUE;
        if ((n % 3) == 0) {
            ans3 = minStepsTo1(n / 3);
        }

        return Math.min(ans1, Math.min(ans2, ans3)) + 1;
    }

    public static int minStepsTo1ByDP(int n, int[] dp) {
        if (n == 1) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans1 = minStepsTo1ByDP(n - 1, dp);
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;

        if (n % 2 == 0) {
            ans2 = minStepsTo1ByDP(n / 2, dp);
        }

        if (n % 3 == 0) {
            ans3 = minStepsTo1ByDP(n / 3, dp);
        }

        dp[n] = 1 + Math.min(ans1, Math.min(ans2, ans3));
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = minStepsTo1ByDP(n, dp);
        System.out.println("Answer -> " + ans);
    }

}
