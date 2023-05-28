package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

//This Code is not suitable for dupilicate values in Array.
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(search(arr, 3));
    }

    static int search(int nums[], int target) {
        int pivot = pivotIndex(nums);

        //If we does not found the pivot number then go for normal Binary Search.
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //If we gets the Binary Search then we have to chase 3 test cases.
        //Case-1:
        //If value of pivot index is equal to target.
        if (nums[pivot] == target) {
            return pivot;
        }

        //We have go through the 2 asc array.
        //Case-2:
        //Target number is greater than 1st number. That is, it is in asc array in first part.
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }

        //Case-3:
        //Target number is lesser than 1st number. That is, it is in asc array in second part.
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        //Breaking the loop condition.
        while (start <= end) {

            //Find the mid value each time the loop runs.
            int mid = start + (end-start) / 2;

            //Number is smaller than mid, then reduce the array to left.
            if (target < nums[mid]) {
                end = mid - 1;
            }
            //Number is greater than mid, then reduce the array to right.
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            //If mid == target we found the answer.
            else {
                return mid;
            }
        }

        //After the loop execution mid != target. So, returning -1.
        return -1;
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
