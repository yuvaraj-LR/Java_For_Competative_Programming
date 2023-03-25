package Assignments.ArraysAndArrayList_04.BasicProblems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {11,2,3},
                {4,5,6},
                {7,1,13}
        };

        int rich = 0;

        for (int row = 0; row < acc.length; row++) {
            int sum = 0;
            for (int cols = 0; cols < acc[row].length; cols++) {
                sum += acc[row][cols];
            }
            rich = Math.max(sum, rich);
        }

        System.out.println(rich);
    }
}
