public class ColumnLargestElement {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0}
        };

        findLargest(arr);
    }
    public static void findLargest(int arr[][]){

        if (arr.length == 0) {
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }
        //Your code goes here
        int[] colLarge = columnLargestElement(arr);
        int[] rowLarge = rowLargestElement(arr);

        if (rowLarge[1] >= colLarge[1]) {
            System.out.println("row " + rowLarge[0] + " " + rowLarge[1]);
        } else {
            System.out.println("column " + colLarge[0] + " " + colLarge[1]);
        }
    }

    public static int[] columnLargestElement(int[][] arr) {
        int answer = 0;
        int maxIndex = 0;
        int[] ans = new int[2];

        for(int i = 0; i < arr[i].length - 1; i++) {
            int temp = 0;

            for (int j = 0; j < arr.length; j++) {
                temp += arr[j][i];
            }

            if (temp > answer) {
                answer = temp;
                maxIndex = i;
            }
        }

        ans[0] = maxIndex;
        ans[1] = answer;

        if (answer == 0) {
            ans[1] = Integer.MIN_VALUE;
        }

        return ans;
    }

    public static int[] rowLargestElement(int[][] arr) {
        int[] ans = new int[2];
        int answer = 0;
        int maxIndex = 0;


        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j];
            }
            if (temp > answer) {
                answer = temp;
                maxIndex = i;
            }
        }

        ans[0] = maxIndex;
        ans[1] = answer;

        if (answer == 0) {
            ans[1] = Integer.MIN_VALUE;
        }

        return ans;
    }
}
