package Patterns.MirrorPatterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//      For Number of rows
        for (int i=1; i<=num; i++) {

//          For Spaces
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }

//          For Increasing part
            for (int k=1; k<=i; k++) {
                System.out.print(k);
            }

//          For Decreasing part
            for (int l=i-1; l>=1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}