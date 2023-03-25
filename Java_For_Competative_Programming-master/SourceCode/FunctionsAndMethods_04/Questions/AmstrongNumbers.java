package SourceCode.FunctionsAndMethods_04.Questions;

import java.util.Scanner;

public class AmstrongNumbers {
    public static void main(String[] args) {
        myMethod();
    }
    private static void myMethod() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = amstrongNumber(num);

        System.out.println(sum);
    }

    private static int amstrongNumber(int num) {
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int ans = rem * rem * rem;
            sum += ans;
            num /= 10;
        }
        return sum;
    }
}
