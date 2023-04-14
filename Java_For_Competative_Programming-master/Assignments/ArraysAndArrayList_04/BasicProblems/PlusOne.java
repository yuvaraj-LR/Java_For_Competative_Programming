package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        actualMethod();
    }

    public static void myTry(){
        int[] num = { 9};
        int k = 1;
        int[] ans = new int[num.length];
        int n = num.length;
        int carry = 0;

        for (int i = n-1; i >= 0; i--) {
            int temp = num[i] + (k % 10) + carry;
            ans[i] = temp % 10;
            carry = temp / 10;
            k /= 10;
        }

        k += carry;
        while (k != 0){
            //ans[] = k%10;
            k /= 10;
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void method1() {

        int[] nums = {9, 2, 3, 9};
        int k = 1;
        int[] ans = new int[nums.length];
        int n = nums.length - 1;
        int carry = 0;
        int temp = nums[n] + 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            if (i == n)
                ans[i] = temp;
        }

        System.out.println(temp);
        System.out.println(Arrays.toString(ans));
    }

    public static void actualMethod() {

        int[] nums = {9};
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 9) {
                nums[i] = 0;
            } else {
                nums[i] += 1;
                break;
            }
        }
        if(nums[0]!=0) System.out.println(Arrays.toString(nums));
        int[] res =new int[n + 1];
        res[0] = 1;
        System.out.println(Arrays.toString(nums));
    }
}
