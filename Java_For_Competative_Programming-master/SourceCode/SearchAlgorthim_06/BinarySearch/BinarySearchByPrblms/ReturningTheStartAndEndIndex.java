package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

import java.util.Arrays;

public class ReturningTheStartAndEndIndex {
    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5, 5, 6, 8, 8 };
        int target = 8;
        int[] ans = returningTheStartAndEndIndex(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] returningTheStartAndEndIndex(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean firstStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            //Find the Middle element.
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;

            else {
                //
                ans = mid;
                if (firstStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }

        return ans;
    }
}
