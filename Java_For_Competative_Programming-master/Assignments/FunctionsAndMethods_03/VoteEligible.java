package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        isNumberEligible(num);
    }

    private static void isNumberEligible(int num) {
        if (num >= 18) System.out.println("Vote Eligible!");
        else System.out.println("Vote Not Eligible!");
    }

}
