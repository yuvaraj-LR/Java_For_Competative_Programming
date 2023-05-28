package SourceCode.SearchAlgorthim_06.LinearSearch;

public class FindRichestPerson {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5}, { 3, 6, 9}, {2, 7,1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
