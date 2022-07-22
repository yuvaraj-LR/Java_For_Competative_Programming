package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class SumAndMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        adding(num1, num2);
        multiplying(num1, num2);
    }

    private static void multiplying(int num1, int num2) {
        System.out.println("Sum = " + num1 * num2);
    }

    private static void adding(int num1, int num2) {
        System.out.println("Product = " + num1 + num2);
    }
}
