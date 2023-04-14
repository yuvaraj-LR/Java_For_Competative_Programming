package SourceCode.LinearSearchAlgorthim_06;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 5, 6}, {3, 5, 7}, {0, 5, 9, 2, 4}};
        //int[][] arr = {{0}};
        int target = 7;
        System.out.println(Arrays.toString(SearchIn2D(arr, target)));
    }

    private static int[] SearchIn2D(int[][] arr, int target) {
        if (arr.length == 0) return new int[]{-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
