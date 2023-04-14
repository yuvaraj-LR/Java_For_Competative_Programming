//Doesn't know how to create 2d ArrayList.  So this Qn is error.



package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
public class CountItemMatching  {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        ArrayList<String> itemsVals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                itemsVals.add(sc.next());
                items.add(itemsVals);
            }
        }
        System.out.println(itemsVals);
    }
}