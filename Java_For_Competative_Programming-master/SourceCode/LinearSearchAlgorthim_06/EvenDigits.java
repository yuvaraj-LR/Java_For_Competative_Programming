package SourceCode.LinearSearchAlgorthim_06;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {23, 543, 5432, 123, 876};
        System.out.println(evenDigit(arr));
    }

    private static int evenDigit(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                arr[i] *= (-1);
            }

            int temp = 0;
            int c = 0;
            while (arr[i] > 0){
                temp = arr[i] % 3;
                arr[i] /= 10;
                c++;
            }

            if (c%2 == 0) {
                count++;
            }
        }

        return count;

    }
}
