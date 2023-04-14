package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CreatingTheTragetArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        ArrayList<Integer> ans = new ArrayList<>();
        int[] answer = new int[nums.length];
        //Expected Output = [0,1,2,3,4]

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int tar = index[i];
            ans.add(tar, temp);
        }

        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        System.out.println(Arrays.toString(answer));

    }
}
