package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int temp = 0;

        for (int i = 2; i < times; i++) {
            temp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = temp;
        }
        System.out.println(temp);
    }
}
