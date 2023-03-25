package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class CurrencyConvetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rupee = sc.nextDouble();

        System.out.println(rupee + " INR = " + (rupee * 76.2725) + " USD.");
    }
}
