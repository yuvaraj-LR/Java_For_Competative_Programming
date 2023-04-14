package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\t\t Calculator\t\t");
            System.out.println("\t\t   MENU");
            System.out.println("\t\t(+, -, *, / )");
            System.out.println();
            System.out.print("Enter your operation : ");
            char choice = sc.next().charAt(0);


            if (choice == '+'){
                System.out.println("\t----------------\t\t");
                System.out.println("\t\tADDITION\t\t");
                System.out.println("\t----------------\t\t");
                System.out.println();
                System.out.print("Enter First Number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int num2 = sc.nextInt();
                int ans = num1 + num2;
                System.out.println("-----------");
                System.out.println("Answer:- " + ans);
                System.out.println("-----------");
            }

            else if (choice == '-'){
                System.out.println("\t-------------------\t\t");
                System.out.println("\t\tSUBTRACTION\t\t");
                System.out.println("\t-------------------\t\t");
                System.out.println();
                System.out.print("Enter First Number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int num2 = sc.nextInt();
                int ans = num1 - num2;
                System.out.println("-----------");
                System.out.println("Answer:- " + ans);
                System.out.println("-----------");
            }

            else if (choice == '*') {
                System.out.println("\t----------------------\t\t");
                System.out.println("\t\tMULTIPLICATION\t\t");
                System.out.println("\t----------------------\t\t");
                System.out.println();
                System.out.print("Enter First Number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int num2 = sc.nextInt();
                int ans = num1 * num2;
                System.out.println("-----------");
                System.out.println("Answer:- " + ans);
                System.out.println("-----------");
            }

            else if (choice == '/'){
                System.out.println("\t----------------\t\t");
                System.out.println("\t\tDIVISION\t\t");
                System.out.println("\t----------------\t\t");
                System.out.println();
                System.out.print("Enter First Number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int num2 = sc.nextInt();
                int ans = num1 / num2;
                System.out.println("-----------");
                System.out.println("Answer:- " + ans);
                System.out.println("-----------");
            }

            else {
                System.out.println("Invalid Operator!!! Try again!!!");
            }

            //while (true) {
            System.out.println();
            System.out.print("Press Y to continue X to exit: ");
            char check;
            check = sc.next().toUpperCase().charAt(0);

            if (check == 'X') {
                break;
            }

            else if (check == 'Y'){
                continue;
            }

            else{
                System.out.println("Invalid Input!!! Try again!!!");
                //System.out.print("Press Y to continue X to exit: ");
                //check = sc.next().toUpperCase().charAt(0);
            }

            System.out.println();
        }
    }
}
