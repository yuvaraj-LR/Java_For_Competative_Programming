package SourceCode.SearchAlgorthim_06.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {14, 21, 64, 23, 97, 15, 34};
        int target = 97;
        int st = 3;
        int end = 5;
        int ans = SearchValuesInRange(nums, target, st, end);

        System.out.println(ans);
    }

    static int SearchValuesInRange(int[] arr, int tar, int start, int end){
        for (int i = start; i<=end; i++){
            if (arr[i] == tar)
                return i;
        }
        return -1;
    }
}
