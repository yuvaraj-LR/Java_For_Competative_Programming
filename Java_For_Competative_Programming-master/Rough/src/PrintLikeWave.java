public class PrintLikeWave {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        wavePrint(mat);
    }

    public static void wavePrint(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
