package SourceCode.ArraysAndArrayList_05.Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndPrintArray2D {
    public static void main(String[] args) {

        int arr2d[][] = new int[3][3];

        //byForLoop(arr2d);
        byForEachLoop(arr2d);
    }

    private static void byForEachLoop(int[][] arr2d) {
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = sc.nextInt();
            }
        }

        for (int[] a : arr2d) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static void byForLoop(int[][] arr2d) {
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
    }
}
