package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class SalaryFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your salary: ");
        double salary = sc.nextDouble();

        if(salary > 10000){
            System.out.println("Your salary is " + salary + ". And your bonus is 2000.");
            System.out.println("So your salary is " + (salary + 2000));
        }

        else{
            System.out.println("Your salary is " + salary + ". And your bonus is 2000.");
            System.out.println("So your salary is " + (salary + 1000));
        }
    }
}
