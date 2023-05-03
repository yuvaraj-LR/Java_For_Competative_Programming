package SourceCode.OOPs_08.OOP_2.Packages.a.b;

import java.util.*;
public class Factors {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;

        byte b = 50;
        System.out.println(b * 50);

        while (i < num) {
            if (num % i == 0) {
                System.out.print(i + " ");
                i += 1;
            } else {
                i += 1;
            }
        }
    }
}
