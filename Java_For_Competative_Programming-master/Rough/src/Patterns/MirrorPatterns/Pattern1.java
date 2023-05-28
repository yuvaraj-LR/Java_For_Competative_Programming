package Patterns.MirrorPatterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<=num; i++) {
            for (int j=0; j<=num-i; j++) {
//                For Spaces
                System.out.print("   ");
            }
            for (int k=0; k<=i; k++) {
//                For stars
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}