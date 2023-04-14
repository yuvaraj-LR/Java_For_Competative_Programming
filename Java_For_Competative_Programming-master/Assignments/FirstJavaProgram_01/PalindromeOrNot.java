package Assignments.FirstJavaProgram_01;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        //forString();
        forNumerals();
    }

    private static void forNumerals() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;

        while (num > 0){
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num /= 10;
        }

        System.out.println(rev);

        System.out.println(rev == num ? "Palindrome." : "Not a Palindrome.");
    }

    private static void forString() {
        Scanner sc = new Scanner(System.in);

        String original, reverse = "";
        original = sc.next();

        int length = original.length();

        for (int i = length-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (reverse.equals(original)) {
            System.out.println("Palindrome.");
        }

        else{
            System.out.println("Not a Palindrome.");
        }

    }
}
