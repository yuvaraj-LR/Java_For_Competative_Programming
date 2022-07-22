package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();

        //Q: Find the largest among three numbers.

        //Method-1

        /*
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3){
            max = num3;
        }
        */

        //Method-2

        int max = Math.max(num3, Math.max(num1, num2));

        System.out.println(max + " is the largest number among three numbers.");

    }
}
