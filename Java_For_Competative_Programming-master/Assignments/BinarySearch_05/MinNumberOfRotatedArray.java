package Assignments.BinarySearch_05;

public class MinNumberOfRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(minNumberOfRotatedArray(arr));
    }

    public static int minNumberOfRotatedArray(int[] arr) {
        int pivot = pivotIndex(arr);
        return arr[pivot+1];
    }

    static int pivotIndex(int[] arr) {
        //See from 10 - 22 is in asc order and 4 - 6 also in asc order but 22, 4 only in desc order
        //So the greatest among that is 22. So, 22 is the PivotNumber.
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            //We have to check 4 cases to get the pivot number.
            //Case-1:
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            //Case-2:
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }
            //Case-3:
            if (arr[mid] <= arr[start] ) {
                end = mid - 1;
            }
            //Case-4:
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
