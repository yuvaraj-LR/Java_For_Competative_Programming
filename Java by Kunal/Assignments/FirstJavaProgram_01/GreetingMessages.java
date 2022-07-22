package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class GreetingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mgs = sc.next();

        System.out.println("Hello " + mgs + "!!!");
    }
}
