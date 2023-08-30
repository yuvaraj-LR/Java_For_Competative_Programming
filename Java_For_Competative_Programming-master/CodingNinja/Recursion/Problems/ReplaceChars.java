package CodingNinja.Recursion.Problems;

import java.util.Scanner;

public class ReplaceChars {

    public static String replaceChars(String str, char a, char b) {

//        Base Condition
        if (str.length() == 0) {
            return "";
        }
//        Recursive Call
        String smallOP = replaceChars(str.substring(1), a, b);

//        Some Calculations
        if (str.charAt(0) == a) {
            return b + smallOP;
        } else {
            return str.charAt(0) + smallOP;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = sc.next();
        char x1 = x.charAt(0);
        String y = sc.next();
        char y2 = y.charAt(0);

        System.out.println(replaceChars(s, x1, y2));

    }
}
