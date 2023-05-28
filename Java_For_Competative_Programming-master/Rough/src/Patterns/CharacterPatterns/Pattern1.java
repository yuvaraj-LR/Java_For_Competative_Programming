package Patterns.CharacterPatterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                char value = (char) ('A' + i - 1);
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
