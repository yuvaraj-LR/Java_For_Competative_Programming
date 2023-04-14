package Assignments.BinarySearch_05;


public class GuessNumber {
    public static void main(String[] args) {
        int n=10, pick=6;
        System.out.println(guessNumber(n, pick));
    }
    public static int guessNumber(int n, int pick) {
        return binarySearch(creatingArray(n), pick) + 1;
    }

    static int[] creatingArray (int n) {
        //Check for n != 0.
        if (n == 0) return new int[]{0};

        int[] noCanBeGuessed = new int[n];
        //Create a array for guess.
        for (int i=0; i<noCanBeGuessed.length; i++) {
            noCanBeGuessed[i] = i+1;
        }

        return noCanBeGuessed;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //Binary Search.
        while (start<=end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
