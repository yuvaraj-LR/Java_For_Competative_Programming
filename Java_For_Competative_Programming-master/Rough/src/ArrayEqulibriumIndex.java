public class ArrayEqulibriumIndex {

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, -10, 4, 2, 9};
//        int[] arr = {3, 5, 1, 4, 9, 3, 2, 3, 5};

        System.out.println(arrayEquilibriumIndex(arr));
    }

    public static int arrayEquilibriumIndex(int[] arr){

        int rSum = 0;
        int lSum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int rightSum = rSum + arr[i - 1];
            rSum = rightSum;

            int leftSum = lSum + arr[i + 1];
            lSum = leftSum;

            if (rightSum == leftSum) return i;
        }

        return -1;
    }

    public static int arrayEquilibriumIndex2(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int rightIndexSum = findSum(arr, 0, i-1);
            int leftIndexSum = findSum(arr, i+1, arr.length-1);

            if (rightIndexSum == leftIndexSum) return i;
        }

        return -1;
    }

    private static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;

    }
}
