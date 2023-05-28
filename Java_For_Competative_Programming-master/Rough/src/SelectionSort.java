import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,7,2,11,8,9};
        selectionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if ( arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    public static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap (arr, maxIndex, last);
        }
    }
}
