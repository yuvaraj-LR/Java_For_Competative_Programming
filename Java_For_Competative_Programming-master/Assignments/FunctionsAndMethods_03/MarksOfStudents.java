package Assignments.FunctionsAndMethods_03;

import java.util.Scanner;

public class MarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();
        checkingGrade(mark);
    }

    private static void checkingGrade(int mark) {
        if (mark >= 90) System.out.println("Grade - AA");
        else if (mark < 90 && mark >= 80) System.out.println("Grade - AB");
        else if (mark < 80 && mark >= 70) System.out.println("Grade - BB");
        else if (mark < 70 && mark >= 60) System.out.println("Grade - BC");
        else if (mark < 60 && mark >= 50) System.out.println("Grade - CD");
        else if (mark < 50 && mark >= 40) System.out.println("Grade - DD");
        else System.out.println("Grade - Fail");
    }
}
