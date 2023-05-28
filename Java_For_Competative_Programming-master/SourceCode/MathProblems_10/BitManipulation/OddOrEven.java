package SourceCode.MathProblems_10.BitManipulation;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();

        System.out.println(isOddOrEven(n));
    }

    private static String isOddOrEven(int n) {

        return (n & 1) == 0 ? "Even." : "Odd.";

    }

}
