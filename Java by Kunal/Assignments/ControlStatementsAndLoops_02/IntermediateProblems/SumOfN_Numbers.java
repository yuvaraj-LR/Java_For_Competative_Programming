package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        int sum = 0;
        while(true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n != 0){
                sum += n;
            }

            if (n == 0)
                break;
        }
        System.out.println("Sum: " + sum);
    }
}
