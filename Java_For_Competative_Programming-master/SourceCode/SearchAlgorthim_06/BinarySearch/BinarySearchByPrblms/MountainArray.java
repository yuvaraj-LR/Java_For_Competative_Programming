package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Default ans is set to be -1.
        int ans = -1;

        while (start <= end){
            //Find the mid element.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                //Check for mid == target and mid < ans.
                if (mid < ans) return mid;
                return ans;
            }
        }

        return ans;
    }
}


