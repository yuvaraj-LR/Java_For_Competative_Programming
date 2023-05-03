package SourceCode.OOPs_08.OOP_2.Packages.a.b;

import java.util.ArrayList;

public class NextGreaterElement {
    public static void main(String[] args) {
        ArrayList<Integer> ARR = new ArrayList<>();
        ARR.add(1);
        ARR.add(2);
        ARR.add(3);
        ARR.add(4);

        System.out.println(nextGreaterElement(ARR, 4));
    }

    public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr, int n)
    {
        int len = arr.size();
        ArrayList<Integer> op_arr = new ArrayList<>(len);

        // Write your code here.
        for (int i=0; i<len; i++) {
            int ans = 0;
            for (int j=i; j<len; j++) {
                if (arr.get(i) < arr.get(j)) {
                    ans = (arr.get(j));
                    break;
                } else {
                    ans = -1;
                }
            }
            op_arr.add(ans);
        }

        return op_arr;
    }
}
