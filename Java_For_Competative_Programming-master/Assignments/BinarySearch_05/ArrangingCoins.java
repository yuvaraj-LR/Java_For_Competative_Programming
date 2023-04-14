package Assignments.BinarySearch_05;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        //Get the start and end values.
        int start = 0;
        int end = n;

        if (n == 1) return 1;

        while (start <= end) {
            //Find the mid value.
            int mid = start + (end-start)/2;
            //Sum of series = n(n+1) / 2.
            int curr = mid * (mid+1)/2;

            if (mid == curr) return mid;

            if (n < curr) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
