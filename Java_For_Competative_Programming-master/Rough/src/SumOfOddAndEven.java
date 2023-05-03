package SourceCode.OOPs_08.OOP_2.Packages.a.b;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sumTheEvenAndOdd(num);
    }

    public static void sumTheEvenAndOdd(int num) {

        int odd = 0;
        int even = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                even += rem;
            } else {
                odd += rem;
            }

            num /= 10;
        }

        System.out.println(odd + " " + even);
    }

}
