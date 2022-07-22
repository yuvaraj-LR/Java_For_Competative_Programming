package SourceCode.ArraysAndArrayList_05.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        ArrayList<String> inner = new ArrayList<>();
        //int n = 5;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String word = sc.next();
                inner.add(word);
            }
            outer.add(inner);
            System.out.println();
        }
        System.out.println(outer);
    }
}
