package CodeRaze;

public class MaxiAND {

    public static void main(String[] args) {
        int[] arr = {3, 5, 4};
        long op = maxiAnd(arr.length, arr);
        System.out.println(op);

//        System.out.println(1 & 3  5 8);
    }
    static long findMaxXor(int num) {
        long max = 1;

        for (int i = 0; i < num; i++) {
            int value = i ^ num;

            if (value > max) max = value;
        }

        return max;
    }

    static long maxiAnd(int n, int []a) {
        // Write your code here.

        long max = 1;

        for (int i = 0; i < n; i++) {
            long maxXor = findMaxXor(a[i]);
            max = max & maxXor;
        }

        return max;
    }
}
