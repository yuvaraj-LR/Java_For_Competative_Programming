package SourceCode.Recursion_09.BasicOfRecursion.Questions;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 77;

        System.out.println(bs(arr, target, 0, arr.length - 1));

    }

    static int bs (int[] arr, int target, int s, int e) {

        if (s > e) return -1;

        int mid = s + ( e - s) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return bs(arr, target, s, mid - 1);
        return bs(arr, target, mid + 1, e);

    }
}
