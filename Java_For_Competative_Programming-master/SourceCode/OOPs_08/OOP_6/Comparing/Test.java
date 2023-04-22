package SourceCode.OOPs_08.OOP_6.Comparing;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr1.add(i*5);
        }

        arr1.forEach(list-> System.out.println(arr1));
    }
}
