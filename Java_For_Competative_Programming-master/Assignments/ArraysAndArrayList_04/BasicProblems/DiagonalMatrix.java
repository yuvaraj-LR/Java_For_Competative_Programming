package Assignments.ArraysAndArrayList_04.BasicProblems;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int num = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i] + arr[i][num-1-i];
        }

        if (num % 2 == 0) System.out.println(sum);
        else System.out.println(sum - arr[num/2][num/2]);
    }
}
