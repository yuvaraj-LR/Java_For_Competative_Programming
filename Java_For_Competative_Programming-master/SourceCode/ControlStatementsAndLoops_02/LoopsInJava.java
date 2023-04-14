package SourceCode.ControlStatementsAndLoops_02;

import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {

        //FOR Loop
        /* SYNTAX
        for (initilising, condition, increment/decrement){}
         */

//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i < n; i+=2) {
//            System.out.println(i);
//        }

        //WHILE Loop
        /*
        Initilizer
        while(Condition){
            body
            increment/decrement
        }
         */


//        int num = 1;
//        while (num <= 6){
//            System.out.println("Number: " + num);
//            num += 1;
//        }

        //DO-WHILE Loop
        /*
        Initilizer
        do{
            body
            increment/decrement
         } while (condition)
         */

        int num = 1;

        do{
            System.out.println("Number: " + num);
            num += 1;
        }while (num <= 5);



    }
}
