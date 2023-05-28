package Patterns.CharacterPatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int temp = num - i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
