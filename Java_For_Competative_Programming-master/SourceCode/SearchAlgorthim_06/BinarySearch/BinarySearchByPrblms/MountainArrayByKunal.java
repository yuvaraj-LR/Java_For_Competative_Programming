package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

public class MountainArrayByKunal {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 7, 5, 3, 1};
        int target = 6;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int peak = peakNumberInBs(arr);
        int ans1 = orderAgnosticBS(arr, target, peak + 1, arr.length-1);
        if (ans1 != -1)
            return ans1;

        return orderAgnosticBS(arr, target, 0, peak );
    }

    static int peakNumberInBs(int[] arr) {
        //Find starting and end indexes.
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //We are in at Descending part.
                end = mid;
            } else {
                //We are in at Ascending part.
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS (int[] arr, int target, int start, int end) {

        //Check whether the array is in ascending or descending?
        boolean isAsc = arr[0] < arr[arr.length-1];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            //If condition is true and it mean that the array is in ascending.
            if (isAsc){
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
