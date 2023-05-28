package Patterns.MirrorPatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        For rows
        for (int i = 1; i <= num; i++) {
//            For spaces
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
//            For Increasing Part
            int temp = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp += 1;
            }

//            For Decreasing Part
            for (int j = temp-1; j > i; j--) {
                System.out.print(j-1);
            }
            System.out.println();
        }
        
    }
}
