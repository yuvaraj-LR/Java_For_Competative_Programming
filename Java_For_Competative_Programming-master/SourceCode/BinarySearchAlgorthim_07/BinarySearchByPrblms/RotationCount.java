package SourceCode.BinarySearchAlgorthim_07.BinarySearchByPrblms;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int[] arr) {
        //Get the pivot number.
        int pivot = pivotIndex(arr);
        if (pivot != -1) {
            //We know that pivot index is the only desc to next.
            //So if we calculate rotationalCount = (pivot - start + 1).
            //We add 1 for index is starting from 0.
            return (pivot + 1);
        }

        return -1;
    }

    static int pivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //Loop Breaking condition.
        while(start <= end) {

            int mid = start + (end - start) / 2;
            //There are 4 cases to get the pivot index.
            //Case-1:
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            //Case-2:
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            //Case-3:
            if (arr[mid] < arr[start]) {
                end = mid-1;
            }

            //Case-4
            else {
                start = mid+1;
            }
        }

        //If there is no cases passed return -1.
        return -1;

    }
}
