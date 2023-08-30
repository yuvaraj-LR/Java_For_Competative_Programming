package CodingNinja.Recursion.Problems;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isSorted = checkArraySorted(arr);
        System.out.println(isSorted);
    }

//    First approach to check Array Sorted or Not in Recursion.
//    Creating new array space will lead to space complexity.
    public static boolean checkArraySorted(int[] arr) {
        if (arr.length == 1) {
            return true;
        }

        if (arr[0] > arr[1]) {
            return false;
        }

        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArray, 0, arr.length - 1);

        return checkArraySorted(newArray);
    }

//    Second approach to check Array Sorted or Not in Recursion.
    public static boolean checkArray(int[] arr, int startIndex) {
        if (startIndex == arr.length - 1) {
            return true;
        }

        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }

        return checkArray(arr, startIndex + 1);
    }
}
