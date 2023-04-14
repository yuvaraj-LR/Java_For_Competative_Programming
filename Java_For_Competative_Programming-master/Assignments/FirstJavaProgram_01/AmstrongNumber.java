package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        /*a number that is equal to the sum of the cubes of its own digits.
        For example, 370 is an Armstrong number
        since 370 = 3*3*3 + 7*7*7 + 0*0*0 .
         */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp, ans = 0;

        while (num > 0){
            int rem = num % 10;
            temp = rem * rem * rem;
            ans += temp;
            num /= 10;
        }

        System.out.println(ans);
    }
}
