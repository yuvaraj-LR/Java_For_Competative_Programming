package SourceCode.FunctionsAndMethods_04;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        sum();
    }

    private static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Total = " + sum);
    }
}
