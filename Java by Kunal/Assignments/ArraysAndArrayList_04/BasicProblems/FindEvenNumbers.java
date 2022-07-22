package Assignments.ArraysAndArrayList_04.BasicProblems;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {5552,9015,4823,1771};
        int count = 0;
        int temp = 1;

        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            while (nums[i] != 0){
                temp %= 10;
                c++;
                nums[i] /= 10;
            }
            if (c%2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
