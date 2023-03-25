package Assignments.ArraysAndArrayList_04.IntermediateProblem;

import java.util.ArrayList;

public class SprialMatrixI {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int size = matrix.length * matrix[0].length;

        if(matrix == null || matrix.length == 0)
            System.out.println(list);

        while(list.size() < size){
            for(int i=left; i<=right && list.size()<size; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom && list.size()<size; i++){
                list.add(matrix[i][right]);
            }
            right--;

            for(int i=right; i>=left && list.size()<size; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i=bottom; i>=top && list.size()<size; i--){
                list.add(matrix[i][left]);
            }
            left++;
        }

        System.out.println(list);
    }
}
