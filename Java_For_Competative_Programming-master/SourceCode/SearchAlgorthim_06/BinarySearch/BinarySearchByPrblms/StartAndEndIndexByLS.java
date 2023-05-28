package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

import java.util.Arrays;

public class StartAndEndIndexByLS {
    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5, 5, 6, 8, 8 };
        int target = 5;
        int[] ans = startAndEndIndexByLs(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] startAndEndIndexByLs(int[] nums, int target) {
        int[] ans = {-1, -1};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                for (int j = nums.length-1; j > 0; j--) {
                    if (nums[i] == nums[j]){
                        ans[0] = j;
                        ans[1] = i;
                    }
                }
            }
        }

        return ans;
    }
}

