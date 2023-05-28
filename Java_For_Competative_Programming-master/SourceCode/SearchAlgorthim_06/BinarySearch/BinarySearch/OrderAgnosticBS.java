package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 21, 54, 72, 86};
        int[] arr2 = { 86, 72, 54, 21, 5, 1};
        int target = 54;
        boolean isAsc = false;
        //Check whether the array is in ascending or descending?
        if (arr1[0] < arr1[arr1.length-1]) isAsc = true;
        else isAsc = false;

        int ans = orderAgnosticBS(arr2, target, isAsc);
        System.out.println(ans);
    }

    static int orderAgnosticBS (int[] arr, int target, boolean isAsc) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            //If condition is true and it mean that the array is in ascending.
            if (isAsc == true){
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }

            //Else condition is false and it mean that the array is in descending.
            else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;

    }
}
