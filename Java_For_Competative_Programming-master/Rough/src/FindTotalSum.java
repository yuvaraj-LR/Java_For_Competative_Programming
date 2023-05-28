public class FindTotalSum {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        totalSum(mat);
    }
    public static int getDiagonalSum(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j || i + j == arr.length - 1) && i != 0 && i != arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int getBoundarySum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    sum += arr[i][j];
                } else {
                    if (j == 0 || j == arr.length - 1) {
                        sum += arr[i][j];
                    }
                }
            }
        }

        return sum;
    }

    public static void totalSum(int[][] mat) {
        //Your code goes here
        if (mat.length <= 1) {
            System.out.println(0);
            return;
        }

        int diagonal = getDiagonalSum(mat);
        int boundary = getBoundarySum(mat);

        System.out.println(diagonal + " " + boundary + " " + (diagonal + boundary));

    }

}
