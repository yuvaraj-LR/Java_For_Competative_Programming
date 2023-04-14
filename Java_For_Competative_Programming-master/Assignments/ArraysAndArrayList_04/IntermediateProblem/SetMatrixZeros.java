package Assignments.ArraysAndArrayList_04.IntermediateProblem;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,4}, {9,0,6}, {7,7,9}};
        int n = matrix.length;
        int m = matrix[0].length;

        int[] matRow = new int[n];
        int[] matCol = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0){
                    matRow[i] = 1;
                    matCol[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matRow[i] == 1 || matCol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
