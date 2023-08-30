package CodingNinja.DP;

public class MinCostPath {

    public static void main(String[] args) {
        int[][] arr = {
                {5, 7, 2, 4},
                {1, 8, 1, 3},
                {6, 2, 9, 5},
                {1, 6, 2, 8}
        };

        int[][] dp = new int[arr.length + 1][arr[0].length + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

//        int ans1 = minCost(arr, 0, 0, dp);
//        System.out.println(ans1);

//        int ans2 = minCostR(arr, 0, 0, dp);
//        System.out.println(ans2);

        int ans3 = minCostI(arr);
        System.out.println(ans3);
    }

    public static int minCostI(int[][] cost) {

        int m = cost.length;
        int n = cost[0].length;

        int[][] dp = new int[cost.length + 1][cost[0].length + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[0].length; j++) {
                if (i == m && j == n) {
                    dp[i][j] = cost[i][j];
                    continue;
                }

                int ans1 = dp[i][j + 1];
                int ans2 = dp[i + 1][j];
                int ans3 = dp[i + 1][j + 1];

                dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }

        return dp[0][0];
    }

    public static int minCostR(int[][] cost, int i, int j, int[][] dp) {
        int m = cost.length;
        int n = cost[0].length;

        if (i == m - 1 && j == n - 1) return cost[i][j];

        if (i >=m || j >= n) return Integer.MAX_VALUE;

        int ans1, ans2, ans3;

        if (dp[i + 1][j] == Integer.MIN_VALUE) {
            ans1 = minCostR(cost, i+1, j, dp);
            dp[i+1][j] = ans1;
        } else {
            ans1 = dp[i+1][j];
        }

        if (dp[i][j + 1] == Integer.MIN_VALUE) {
            ans2 = minCostR(cost, i, j + 1, dp);
            dp[i][j + 1] = ans2;
        } else {
            ans2 = dp[i][j + 1];
        }

        if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
            ans3 = minCostR(cost, i + 1, j + 1, dp);
            dp[i + 1][j + 1] = ans3;
        } else {
            ans3 = dp[i + 1][j + 1];
        }

        return cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));

    }

    public static int minCost(int[][] cost, int i, int j, int[][] dp) {
        int m = cost.length - 1;
        int n = cost[0].length - 1;

        if (i == m && j == n) return cost[i][j];

        if (i >= m || j >= n) return Integer.MAX_VALUE;

        int ans1 = minCost(cost, i + 1, j, dp);
        int ans2 = minCost(cost, i, j + 1, dp);
        int ans3 = minCost(cost, i + 1, j + 1, dp);

        return cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
    }
}
