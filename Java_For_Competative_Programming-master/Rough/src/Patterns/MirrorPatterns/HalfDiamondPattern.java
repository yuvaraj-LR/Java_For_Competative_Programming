package Patterns.MirrorPatterns;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("*");

//        For Upper part
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }

//        For Lower Part
        for (int i = num-1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.println("*");
    }
}
