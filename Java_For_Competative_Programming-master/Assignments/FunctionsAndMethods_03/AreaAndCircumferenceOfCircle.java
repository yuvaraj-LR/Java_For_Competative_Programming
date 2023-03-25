package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radi = sc.nextInt();
        areaOfCircle(radi);
        circumferenceOfCircle(radi);
    }

    private static void circumferenceOfCircle(int radi) {
        System.out.println("Circumference = " + (2 * Math.PI * radi));
    }

    private static void areaOfCircle(int radi) {
        System.out.println("Radius = " + (2 * Math.PI * radi * radi));
    }
}
