package SourceCode.FirstJavaProgram_01;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value from -127 to 126 :");
//        int integer = sc.nextByte();
//        System.out.println("Entered value " + integer + ".");

        // TYPE CASTING
        int num = (int) (67.54f);
        //System.out.println(num);

        // AUTOMATIC PROMOTING DATA TYPES.
        byte a = 10;
        byte b = 20;
        byte c = 50;

        int ans = (a*b)/c;
        System.out.println("Answer -> " + ans);


    }
}
