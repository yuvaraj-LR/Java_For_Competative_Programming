package SourceCode.MathProblems_10.Math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        squareRoot(num);
    }

    public static void squareRoot(int n) {
        int ans = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i * i <= n) {
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
