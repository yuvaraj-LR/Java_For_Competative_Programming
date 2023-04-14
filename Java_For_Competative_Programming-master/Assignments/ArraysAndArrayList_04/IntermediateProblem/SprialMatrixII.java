package Assignments.ArraysAndArrayList_04.IntermediateProblem;

import java.util.Arrays;

public class SprialMatrixII {
    public static void main(String[] args) {
        int n = 4;
        int[][] list = new int[n][n];
        int top = 0;
        int bottom = list.length-1;
        int left = 0;
        int right = list.length-1;
        int counter = 1;

        if (list==null || list.length==0)
            System.out.println(list);

        while(top<=bottom && left <= right){
            for (int i = left; i <= right; i++) {
                list[top][i] = counter++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list[i][right] = counter++;
            }
            right--;

            for (int i = right; i >= left ; i--) {
                list[bottom][i] = counter++;
            }
            bottom--;

            for (int i = bottom; i >= top ; i--) {
                list[i][left] = counter++;
            }
            left++;
        }

        System.out.println(Arrays.deepToString(list));
    }
}
