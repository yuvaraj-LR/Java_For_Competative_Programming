package Patterns.MirrorPatterns;

import java.util.Scanner;

public class AnswerForP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n1 = (num + 1) / 2;
        int n2 = n1 - 1;

//        For Upper Part
        for (int i=1; i<=n1; i++) {
//            For Spaces
            for (int j=1; j<=n1-i; j++) {
                System.out.print(" ");
            }
//            For Stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        For Lower Part
        for (int i=n2; i>=1; i--) {
//            For Spaces
            for (int j=1; j<=n2-i+1; j++) {
                System.out.print(" ");
            }
//            For Stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
