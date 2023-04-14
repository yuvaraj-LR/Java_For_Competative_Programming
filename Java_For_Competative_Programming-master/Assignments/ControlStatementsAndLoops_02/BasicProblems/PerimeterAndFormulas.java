package Assignments.ControlStatementsAndLoops_02.BasicProblems;

import java.util.Scanner;

public class PerimeterAndFormulas {
    public static void main(String[] args) {
        // perimeterOfCircle();
        // perimeterOfTriangle();
        // perimeterOfParallelogram();
        // perimeterOfRectangle();
         perimeterOfRhombus();
    }

    private static void perimeterOfRhombus() {

        //Perimeter of Rhombus = 4(Side)
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println(4 * a);
    }

    private static void perimeterOfRectangle() {

        //Perimeter of Parallelogram = 2(Length + Width)
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Perimeter of Rectangle: " + (2 * (a+b)));
    }

    private static void perimeterOfParallelogram() {

        //Perimeter of Parallelogram = 2(Side + Base)
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Perimeter of Parallelogram: " + (2 * (a+b)));
    }

    private static void perimeterOfTriangle() {

        //Perimeter of Triangle = Side + Base + Side
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("Perimeter of Trianlge : " + (a + b + c));
    }

    private static void perimeterOfCircle() {

        //Perimeter Of Circle = 2 * PI * r
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("Perimeter of Circle : " + (2 * Math.PI * radius));

    }
}
