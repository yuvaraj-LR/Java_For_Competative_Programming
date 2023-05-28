package Patterns.MirrorPatterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = num/2 + 1;
        int n2 = n1 - 1;

        for (int i = 1; i <= n1; i++) {
            //Increasing Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n2; i >= 1; i--) {
            //Decreasing Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
