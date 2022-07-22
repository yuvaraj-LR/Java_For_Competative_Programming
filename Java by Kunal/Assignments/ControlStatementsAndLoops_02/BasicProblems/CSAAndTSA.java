package Assignments.ControlStatementsAndLoops_02.BasicProblems;

import java.util.Scanner;

public class CSAAndTSA {
    /*
    CSA -> Closed Surface Area.
    TSA -> Total Surface Area.
     */

    public static void main(String[] args) {
//        CSA_Of_Cylinder();
//        TSA_Of_Cylinder();
        CSA_Of_Cube();
        TSA_Of_Cube();
    }

    private static void TSA_Of_Cube() {

        //TSA of Cylinder = 6 * (side * side)
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        System.out.println("TSA of Cyclinder: " + (6 * (side * side)));
    }

    private static void CSA_Of_Cube() {

        //CSA of Cylinder = 4 * (side * side)
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        System.out.println("CSA of Cyclinder: " + (4 * (side * side)));
    }

    private static void TSA_Of_Cylinder() {

        // TSA of Cylinder = 2 * PI * radius * (height + radius) (sq.units)
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("TSA of Cylinder: " + (2 * Math.PI * radius) * (height + radius));
    }

    private static void CSA_Of_Cylinder() {

        // CSA of Cylinder = 2 * PI * radius * height (sq.units)
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("CSA of Cylinder: " + (2 * Math.PI * (radius * height)));

    }
}
