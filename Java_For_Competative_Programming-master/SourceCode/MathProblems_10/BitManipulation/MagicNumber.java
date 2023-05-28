package SourceCode.MathProblems_10.BitManipulation;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(magicNumber(n));
    }

    public static int magicNumber(int n) {
        int num = 0;
        int powerof5 = 5;

        while (n != 0) {
            int rem = n & 1;
            num += rem * powerof5;
            powerof5 *= 5;
            n = n >> 1;
        }
        return num;
    }
}
