package SourceCode.SwitchStatements_03;

import java.util.Scanner;

public class WeekAndWeekEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = sc.nextInt();
        oldSwitchMethod(day);
        newSwitchMethod(day);
    }

    private static void newSwitchMethod(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay.");
            case 6, 7 -> System.out.println("WeekEnd.");
            default -> System.out.println("Enter a valid day.");
        }
    }


    private static void oldSwitchMethod(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay.");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd.");
                break;
            default:
                System.out.println("Enter a valid day.");
        }
    }
}
