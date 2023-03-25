package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class SubtractTheProductAndSum {
    /*
     Given an integer number n, return the difference between
     the product of its digits and the sum of its digits.
     */

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int productOfDigit = 1;
        int sumOfDigit = 0;

        while (n > 0) {
            int rem = n % 10; //Getting last Number
            productOfDigit *= rem;
            sumOfDigit += rem;
            n /= 10;
        }
        System.out.println(productOfDigit - sumOfDigit);
    }
}
