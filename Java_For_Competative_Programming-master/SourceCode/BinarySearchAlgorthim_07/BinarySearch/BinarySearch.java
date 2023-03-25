package SourceCode.BinarySearchAlgorthim_07.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 14, 17, 36, 48, 54};
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println("Index position -> " + ans);
    }

    //Return the target element position.
    //If not founded return -1.
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }
}
