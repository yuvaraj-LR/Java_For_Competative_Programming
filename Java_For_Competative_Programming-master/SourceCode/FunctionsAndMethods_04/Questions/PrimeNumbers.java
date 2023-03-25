package SourceCode.FunctionsAndMethods_04.Questions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = isPrime(n);
        if (ans == 0)
            System.out.println(n + " is prime.");
        else
            System.out.println(n + " is not a prime.");
    }

    private static int isPrime(int n) {
        int sum = 0;
        if (n > 1) {
            for (int i=2; i<=n/2; i++) {
                if (n % i == 0) {
                    sum += 1;
                }
            }
        }
        return sum;

    }
}
