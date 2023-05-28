package Patterns.TriangalPatterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int sum = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + "  ");
                sum++;
            }
            System.out.println();
            sum--;
        }
    }
}
