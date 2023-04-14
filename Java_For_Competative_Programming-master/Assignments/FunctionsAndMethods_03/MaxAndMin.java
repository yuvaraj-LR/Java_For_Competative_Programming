package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        UserInputs();
    }

    private static void UserInputs() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        CheckForMaxAndMin(num1, num2, num3);
    }

    private static void CheckForMaxAndMin(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) System.out.println("Max = " + num1);
        else if ((num2 > num3) && (num2 > num1)) System.out.println("Max = " + num2);
        else System.out.println("Max = " + num3);

        if ((num1 < num2) && (num1 < num3)) System.out.println("Min = " + num1);
        else if ((num2 < num1) && (num2 < num3)) System.out.println("Min = " + num2);
        else System.out.println("Min = " + num3);
    }
}
