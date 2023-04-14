package SourceCode.ArraysAndArrayList_05.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //How to create and print nested arraylist.
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
//        To declare the arrayList of arrays.
        for (int i = 0; i < 3; i++) {
            arr2D.add(new ArrayList<>());
        }

//        To declare the values for that arrays.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2D.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr2D);
    }
}
