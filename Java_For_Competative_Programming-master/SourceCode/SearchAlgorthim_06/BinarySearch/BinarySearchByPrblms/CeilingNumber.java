package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 13, 18, 22, 30, 41 };
        int target = 50;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }

    //Return the number which is smallest >= target.
    static int ceilingNumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //What if the target is greater than the array's end element.
        if (target > arr[end]) return-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return arr[mid];
        }

        return arr[start];
    }
}
