package Patterns.TriangalPatterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Outer Loop for place the cursor in the line
        for (int i=1; i<=n; i++) {
//            To printing the column's space
            for (int spc = n-i; spc >= 1; spc--) {
                System.out.print(" ");
            }

//            To printing the column's symbol
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

//            To print the no of lines
            for (int j = n-i; j >= 1; j--) {
                System.out.println();
            }
            System.out.println();
        }
    }
}


