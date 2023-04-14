package Assignments.BinarySearch_05;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 2;
        System.out.println(findKthPositive(arr, n));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the missing number is in the arr or outside of the arr.
        int missing = compute(arr[arr.length - 1], arr.length);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //If the number is in arr.
            missing = compute(arr[mid], mid+1);
            if (missing >= k) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        //Some cases right = -1;
        if (end == -1) {
            return k;
        }

        //formula
        return arr[end] + k - compute(arr[end], end+1);
    }

    public static int compute(int actual, int expected) {
        return actual - expected;
    }
}
