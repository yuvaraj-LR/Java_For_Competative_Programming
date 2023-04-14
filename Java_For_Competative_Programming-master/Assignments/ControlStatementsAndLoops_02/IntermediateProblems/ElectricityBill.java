package Assignments.ControlStatementsAndLoops_02.IntermediateProblems;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double billToPay = 1;

        if (units < 100) {
            billToPay = units * 1.20;
        }
        else if (units > 100 && units < 300){
            billToPay = (100 * 1.20) + ((units - 100) * 2);
        }
        else if (units < 500) {
            billToPay = ((100 * 1.20) + (200 * 2) + ((units - 300) * 2.50));
        }

        System.out.println(billToPay);
    }
}
