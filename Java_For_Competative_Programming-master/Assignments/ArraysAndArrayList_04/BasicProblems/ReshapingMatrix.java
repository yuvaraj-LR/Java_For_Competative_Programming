package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class ReshapingMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {3,4,5}};
        int r = 3;
        int c = 2;

        int l=matrix.length;
        int m=matrix[0].length;

        if(r*c!=l*m)
            System.out.println(Arrays.toString(matrix));

        int ans[][]=new int[r][c];

        int col=0;
        int row=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ans[row][col]=matrix[i][j];
                col++;
                if(col==c)
                {
                    row++;
                    col=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
