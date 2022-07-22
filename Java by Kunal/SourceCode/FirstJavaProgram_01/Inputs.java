package SourceCode.FirstJavaProgram_01;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Lucky Number: ");
        int num = sc.nextInt();
        System.out.println("Your Lucky Number is " + num + ".");
    }
}
