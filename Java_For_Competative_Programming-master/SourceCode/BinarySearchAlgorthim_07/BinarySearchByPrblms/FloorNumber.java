package SourceCode.BinarySearchAlgorthim_07.BinarySearchByPrblms;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 13, 18, 22, 30, 41 };
        int target = 1;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    //Return the number which is greatest <= target.
    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if (target < arr[start]) return -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else return arr[mid];
        }

        return arr[end];
    }
}
