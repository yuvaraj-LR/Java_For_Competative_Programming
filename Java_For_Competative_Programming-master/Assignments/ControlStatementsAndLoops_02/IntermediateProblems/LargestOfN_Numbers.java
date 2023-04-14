package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class LargestOfN_Numbers {
    public static void main(String[] args) {
        int largest = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n != 0)
                largest = Math.max(n, largest);
            if (n == 0)
                break;
        }
        System.out.println("Largest: " + largest);
    }
}
