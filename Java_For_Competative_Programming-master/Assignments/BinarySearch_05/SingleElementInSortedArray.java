package Assignments.BinarySearch_05;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        //Boundary cases.
        //In the array the last indexed value is 0 then return that 0 because the array doesn't contain -ve nums.
        if (nums[end] == 0){
            return nums[end];
        }

        //If the starting element is not equal to next element means that start element is the unique element.
        if (nums[0] != nums[1]){
            return nums[0];
        }
        //If the last element is not equal to before element means that last element is the unique element.
        if (nums[end] != nums[end-1]){
            return nums[end];
        }

        while (start <= end) {
            int mid = start + (end-start) / 2;

            //If both the mid+1 and mid-1 element are not equal to mid means that mid is unique element.
            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
                return nums[mid];
            }

            //Check for the index before the unique element the paired element start will be in even.
            if ((mid%2) == 0 && nums[mid] == nums[mid+1] || (mid%2) == 1 && nums[mid] == nums[mid-1]) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }

        //If no cases were passed ther is no unique element occurs in that array.
        return -1;
    }


}
