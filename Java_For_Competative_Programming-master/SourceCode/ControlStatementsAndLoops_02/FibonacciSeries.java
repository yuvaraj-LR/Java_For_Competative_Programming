package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howManyTimes = sc.nextInt();
        //Q: Find Nth number fibonicc series.
        //myMethod(howManyTimes);
        actualMethod(howManyTimes);

    }

    public static void actualMethod(int howManyTimes) {
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= howManyTimes){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

    public static void myMethod(int howManyTimes) {

        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        int sumOfNum = 1;
        System.out.print(firstNum + " " + secondNum + " ");

        for (int i = 0; i < howManyTimes-2; i++) {
            thirdNum = firstNum + secondNum;
            sumOfNum += thirdNum;
            System.out.print(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;

        }

        System.out.println();
        System.out.println("Sum of " + howManyTimes +"th times Fibonicc Series is " + sumOfNum);

    }

}
