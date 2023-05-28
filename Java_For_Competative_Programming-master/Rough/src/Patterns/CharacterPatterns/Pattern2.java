package Patterns.CharacterPatterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char start = 'A';

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num; j++) {
                System.out.print(start);
                start++;
            }
            start -= num - 1;
            System.out.println();
        }
    }
}
