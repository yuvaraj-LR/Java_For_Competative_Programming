package Assignments.BinarySearch_05;

import java.util.Arrays;

public class SearchForRotatedarrayII {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 0, 1, 2, 3, 4};
        int target = 0;
        System.out.println(searchForRotatedArrayII(arr, target));
    }

    static boolean searchForRotatedArrayII(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
