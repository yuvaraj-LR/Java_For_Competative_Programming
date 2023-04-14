package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double T = sc.nextDouble();
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);

    }
}
