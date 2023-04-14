package SourceCode.ArraysAndArrayList_05.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> MultiList = new ArrayList<>();

        for (int declare_row = 0; declare_row < 3; declare_row++) {
            MultiList.add(new ArrayList<>());
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                MultiList.get(row).add(sc.nextInt());
            }
        }
        System.out.print(MultiList + " ");
    }
}
