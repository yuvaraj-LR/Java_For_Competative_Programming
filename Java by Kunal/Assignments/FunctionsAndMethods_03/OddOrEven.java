package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        isNumberIsOddOrEven(num);
    }

    private static void isNumberIsOddOrEven(int num) {
        if (num % 2 == 0) System.out.println("Even!");
        else System.out.println("Odd!");
    }
}
