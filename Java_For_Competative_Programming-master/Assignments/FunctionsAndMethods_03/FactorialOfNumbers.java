package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class FactorialOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factOfNumber(num);
    }

    private static void factOfNumber(int num) {
        int temp = 1;
        for (int i = num; i > 1; i--) {
            temp *= i;
        }
        System.out.println("Fact = " + temp);
    }
}
