package Assignments.ControlStatementsAndLoops_02.BasicProblems;

import java.util.Scanner;

public class AreaAndFormulas {
    public static void main(String[] args) {
        // AreaOfCircle();
        // AreaOfTriangle();
        // AreaOfRectangle();
        // AreaOfParallelogram();
        AreaOfRhomus();

    }

    private static void AreaOfRhomus() {

        // Area of Rectangle = length * breath
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float q = sc.nextFloat();
        System.out.println("Area Of Rhomus : " + (p * q)/2);

    }

    private static void AreaOfParallelogram() {

        // Area of Parallelogram = length * width
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        System.out.println("Area Of Parallelogram : " + (length * width));

    }

    private static void AreaOfRectangle() {

        // Area of Rectangle = length * breath
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breath = sc.nextFloat();
        System.out.println("Area Of Rectangle : " + (length * breath));
    }

    private static void AreaOfTriangle() {

        // Area of Triangle = 1/2 * height * breath
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        float breath = sc.nextFloat();
        System.out.println("Area Of Triangle : " + ((height * breath)/2));
    }

    private static void AreaOfCircle() {

        // Area of Circle = PI * radius * radius
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("Area Of Circle : " + (Math.PI * radius * radius));
    }
}
