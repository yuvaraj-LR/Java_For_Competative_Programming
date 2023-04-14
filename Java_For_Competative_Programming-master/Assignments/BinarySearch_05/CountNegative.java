package Assignments.BinarySearch_05;

public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = {{-1, -1, -1, -1}, { 2, 3, -1}, {0, -2, 5, 6}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {

        //By Linear Search.
        int ans = 0;

        //Outer Loop.
        for (int i = 0; i < grid.length-1; i++) {
            //Inner Loop.
            for (int j = 0; j < grid[i].length-1; j++) {
                //Check for negative numbers.
                if(grid[i][j] < 0) {
                    //If yes, then increment ans.
                    ans++;
                }
            }
        }
        //Returning the ans.
        return ans;

    }
}
