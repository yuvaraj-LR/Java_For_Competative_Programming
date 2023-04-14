package Assignments.BinarySearch_05;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length && nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
