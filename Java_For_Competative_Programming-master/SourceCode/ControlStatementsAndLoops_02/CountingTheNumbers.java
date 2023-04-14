package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class CountingTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 10 digit number: ");
        int number = sc.nextInt();
        
        //Q: Find the number of occurance of a particular number.
        //myMethod(number);
        actualMethod(number);
    }

    public static void actualMethod(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        while (number > 0){
            int rem = number % 10;
            //System.out.println(rem);
            if (rem == n){
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }

    public static void myMethod(String number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < number.length(); i++) {
            if (n == number.charAt(i)){
                count += 1;
            }
        }

        System.out.println(count);
    }
}
