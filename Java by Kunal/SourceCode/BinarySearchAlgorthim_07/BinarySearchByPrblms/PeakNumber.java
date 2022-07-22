package SourceCode.BinarySearchAlgorthim_07.BinarySearchByPrblms;

public class PeakNumber {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakNumberInBs(arr));
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
    static int peakNumberInLs(int[] arr) {

        //Initilize ans = arr[1]th value.
        int ans = 0;
        int temp = 0;

        //find the largest number.
        for (int i = 0; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
                temp = i;
            }
        }

        return temp;
    }
}
