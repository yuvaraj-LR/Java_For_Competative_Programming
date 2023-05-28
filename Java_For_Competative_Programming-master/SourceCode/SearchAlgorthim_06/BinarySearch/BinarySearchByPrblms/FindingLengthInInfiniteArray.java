package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;
//After searching more than 5th element index error will occur will occur.

public class FindingLengthInInfiniteArray {
    public static void main(String[] args) {
        //Program inzilisation.
        int[] arr = {3, 6, 8, 9, 11, 15, 17, 20, 25, 29, 32};
        int target = 15;
        System.out.println(ans(arr, target));
    }

    //Search for the range of start and end for target.
    static int ans(int[] arr, int target) {

        //Assume start, end.
        int start = 0;
        int end = 1;

        //Condition that target is smaller than arr[end].
        while(target > arr[end]) {
            int temp = end + 1;
            // end = end + (size of the array rang * 2).
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        // After the loop now use the BS method to search in that range.
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        //We already know the range where to start and where to end.
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
