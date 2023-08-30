package CodingNinja.Test4;

public class Print2D {
    public static int findFactorial(int n) {
        int count = 1;

        while (n != 0) {
            count *= n;
            n -= 1;
        }

        return count;
    }

    public static void print2DArray(int[][] arr) {
        // Write your code here

        int fact = findFactorial(arr.length);

        for (int i = 0; i < arr.length - 1; i++) {

            int[] ansArray = new int[arr.length - 1];

            for (int j = 0; j < arr[i].length - 1; j++) {
                ansArray[j] = arr[i][j];
            }

            int count = arr.length - 1;

            for (int k = 0; k < count; k++) {
                for (int l = 0; l < arr.length - 1; l++) {
                    System.out.print(ansArray[l]);
                }
                System.out.println();
                count--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {8, 9, 10}
        };
        print2DArray(arr);
    }
}
