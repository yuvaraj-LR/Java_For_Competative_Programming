package SourceCode.MathProblems_10.BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((n & (n -1)) == 0 ? "Power Of 2" : "Not the Power Of 2");



    }
}
