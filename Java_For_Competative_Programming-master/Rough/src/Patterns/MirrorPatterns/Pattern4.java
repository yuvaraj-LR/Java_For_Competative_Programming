package Patterns.MirrorPatterns;
import java.util.Scanner;

//Still having few corrections.
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        For Upper-Part Stars
        for (int i = 1; i <= num + 1; i++) {
//            For spaces
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
//            For Increasing Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            For Decreasing Part
            for (int j = i; j>1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        For Lower-Part Stars
        for (int i = num/2; i >= 1; i--) {
//            For Spaces
            for (int j = i-1; j <= num/2; j++) {
                System.out.print(" ");
            }
//            Increasing Part
            for (int j = (num/2)-i; j < num/2; j++) {
                System.out.print("*");
            }
//            Decreasing Part
            for (int j = i; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
