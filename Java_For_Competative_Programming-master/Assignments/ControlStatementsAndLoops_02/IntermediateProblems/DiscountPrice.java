package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productAmount = sc.nextInt();
        int productDiscount = sc.nextInt();

        System.out.println("Discount = " + (productAmount * (productDiscount/100)));
    }
}
