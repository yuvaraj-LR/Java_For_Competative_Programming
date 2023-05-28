public class FindLargest {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 5, 9}
        };

        findLargest(arr);
    }


    public static int sum (int[][] arr, int row, int col) {

        int sum = 0;
        for (int i = row; i < arr.length; i++) {
            int temp = 0;

            for (int j = col; j < arr[0].length; j++) {

                temp += arr[i][j];
            }

            if (temp > sum) {
                sum = temp;
            }
        }

        return sum;
    }

    public static void findLargest(int arr[][]){
        //Your code goes here

        int rowHighest = 0;
        int rowHighestIndex = 0;


// This is for find the highest rowth addition number.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = sum(arr, i, j);

                if (temp > rowHighest) {
                    rowHighest = temp;
                    rowHighestIndex = i;
                }
            }
        }

        int colHighest = 0;
        int colHighestIndex = 0;

// This is for find the highest colth addition number.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = sum(arr, j, i);

                if (temp > rowHighest) {
                    colHighest = temp;
                    colHighestIndex = j;
                }
            }
        }

        if (rowHighest > colHighest) {
            System.out.println("Row" + " " + rowHighestIndex+ " " + rowHighest);
        }
        else {
            System.out.println("Column" + " " + colHighestIndex + " " + colHighest);
        }

    }


}
