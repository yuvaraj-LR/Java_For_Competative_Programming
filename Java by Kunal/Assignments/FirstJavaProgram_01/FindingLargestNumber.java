package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class FindingLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        System.out.println("Answer: " + Math.max(num_1, num_2));
    }
}
