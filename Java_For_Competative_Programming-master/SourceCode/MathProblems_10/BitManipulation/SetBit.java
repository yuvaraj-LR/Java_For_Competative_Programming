package SourceCode.MathProblems_10.BitManipulation;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));

//        This is one method to count the number of 1's bit.
        System.out.println(Integer.bitCount(n));

//        Another Method
        System.out.println(setBit(n));
    }

    public static int setBit(int n) {
        int count = 0;

        while ( n > 0 ) {
            count++;

            n -= (n & (-n));
        }

        return count;
    }
}
