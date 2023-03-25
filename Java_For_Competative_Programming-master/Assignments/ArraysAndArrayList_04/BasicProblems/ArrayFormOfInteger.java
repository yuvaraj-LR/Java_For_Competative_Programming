package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = { 2, 7, 4};
        int k = 181;
        ArrayList<Integer> list = new ArrayList<>();
        int n = num.length;
        int carry = 0;

        for (int i = n-1; i >= 0; i--) {
            int temp = num[i] + (k%10) + carry;
            list.add(temp%10);
            carry = temp/10;
            k /= 10;
        }

        k += carry;
        while (k != 0){
            list.add(k%10);
            k /= 10;
        }


        Collections.reverse(list);

        System.out.println(list);

    }
}
