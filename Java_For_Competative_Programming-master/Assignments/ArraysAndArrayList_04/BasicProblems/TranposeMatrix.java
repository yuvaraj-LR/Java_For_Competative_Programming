package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class TranposeMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //Expected Output
//        {
//            {1, 4, 7},
//            {2, 5, 8},
//            {3, 6, 9}
//        }

        int[][] mat = new int[nums[0].length][nums.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = nums[j][i];
            }
        }

        System.out.println(Arrays.deepToString(mat));


    }
}
