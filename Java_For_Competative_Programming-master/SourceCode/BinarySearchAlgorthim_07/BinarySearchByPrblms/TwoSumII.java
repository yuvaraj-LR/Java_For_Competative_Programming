package SourceCode.BinarySearchAlgorthim_07.BinarySearchByPrblms;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] num = { 2, 3, 7, 9, 12, 14};
        int target = 15;
        int[] ans = twoSum(num, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        //int[] ans = new int[2];

        while (start <= end) {
            //Store the sum of start and end.
            int sum = numbers[start] + numbers[end];

            //Check if the target number is smaller than sum. Then move the end.
            if (target < sum) {
                end--;
            }
            //Check if the target number is greater than sum. Then move the start.
            else if (target > sum) {
                start++;
            }
            //If both the target and sum is equal then return.
            else {
                return new int[]{start+1, end+1};
            }
        }
        //If the sum and target are not equal then return {-1, -1}.
        return new int[]{-1, -1};
    }
}
