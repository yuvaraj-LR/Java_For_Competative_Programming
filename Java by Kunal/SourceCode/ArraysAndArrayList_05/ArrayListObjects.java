package SourceCode.ArraysAndArrayList_05;

import java.util.ArrayList;

public class ArrayListObjects {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(5);
        arrList.add(12);
        arrList.add(254);
        arrList.add(247);
        arrList.add(44);
        arrList.add(66);
        arrList.add(76);

        System.out.println(arrList);
        arrList.set(2, 71);
        arrList.remove(5);
        System.out.println(arrList);
    }
}
