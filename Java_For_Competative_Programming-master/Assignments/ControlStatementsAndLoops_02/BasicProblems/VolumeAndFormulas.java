package Assignments.ControlStatementsAndLoops_02.BasicProblems;

import java.util.Scanner;

public class VolumeAndFormulas {
    public static void main(String[] args) {

        // VolumeOfCone();
        // VolumeOfPrism();
        // VolumeOfCylinder();
        // VolumeOfSphere();
        VolumeOfPyramid();

    }

    private static void VolumeOfPyramid() {

        //Volume of Pyramid = (length * width * height) / 3
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Volume of Pyramid: " + (length * width * height) / 3);

    }

    private static void VolumeOfSphere() {

        //Volume of Sphere = 4 * PI * (radius * radius * radius) / 3
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("Volume of Sphere: " + (4 * Math.PI * (radius * radius * radius))/3);


    }

    private static void VolumeOfCylinder() {

        //Volume of Cylinder = Math.PI * (radius * radius) * height
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Volume of Cylinder: " + (Math.PI * (radius * radius) * height));

    }

    private static void VolumeOfPrism() {

        //Volume of Prism = Base * Height
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Volume Of Prism: " + (base * height));

    }

    private static void VolumeOfCone() {

        //Volume Of Cone = (PI * (radius * radius) * height) / 3
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Volume Of Cone: " + (Math.PI * (radius * radius) * height)/3);
    }
}
