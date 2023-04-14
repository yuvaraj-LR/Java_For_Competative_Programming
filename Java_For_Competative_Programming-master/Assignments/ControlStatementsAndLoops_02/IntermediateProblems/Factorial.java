package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;

        for (int i = n; i > 0 ; i--) {
            ans *= i;
        }

        System.out.println(ans);

    }
}
