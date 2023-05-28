package Patterns.MirrorPatterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // OuterLoop
        for (int i = num; i >= 1; i--) {
            // For First-Part Number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // For First-Part Stars
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }

            // For Second-Part Stars
            for (int j = num - i; j > 0 ; j--) {
                System.out.print("*");
            }

            // For Second-Part Starts
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println(1234 % 100);

    }

}
