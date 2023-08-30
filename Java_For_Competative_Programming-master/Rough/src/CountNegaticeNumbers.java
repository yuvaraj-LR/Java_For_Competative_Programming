public class CountNegaticeNumbers {

    public static void main(String[] args) {
        int[][] arr = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans = countNegatives(arr);

        System.out.println("Negative Numbers Count : " + ans);

    }

    public static int countNegatives(int[][] grid) {
        if (grid.length - 1 == 0) {
            return grid[0][0];
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
