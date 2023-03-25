package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int n = side3 * side3;
        //System.out.println(n);
        int ans = calc(side1, side2);
        if (n == ans) System.out.println("LHS = RHS");
        else System.out.println("LHS ≠ RHS");
    }

    private static int calc(int side1, int side2) {
        int sum =((side1 * side1) + (side2 * side2));
        //System.out.println(sum);
        return sum;
    }
}
