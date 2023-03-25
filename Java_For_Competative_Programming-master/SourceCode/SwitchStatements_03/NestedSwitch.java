package SourceCode.SwitchStatements_03;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();
        newMethod(empID, dept);
        //oldMethod(empID, dept);
    }

    private static void newMethod(int empID, String dept) {
        switch (empID) {
            case 1 -> {
                System.out.println("Yuvaraj");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department.");
                    case "Management" -> System.out.println("Management Department.");
                    case "Support" -> System.out.println("Support Department.");
                    default -> System.out.println("Enter a valid Department.");
                }
            }
            case 2 -> {
                System.out.println("Jana");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department.");
                    case "Management" -> System.out.println("Management Department.");
                    case "Support" -> System.out.println("Support Department.");
                    default -> System.out.println("Enter a valid Department.");
                }
            }
            case 3 -> {
                System.out.println("Vicky");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department.");
                    case "Management" -> System.out.println("Management Department.");
                    case "Support" -> System.out.println("Support Department.");
                    default -> System.out.println("Enter a valid Department.");
                }
            }
            default -> System.out.println("Enter a valid EmpID.");
        }
    }

    private static void oldMethod(int empID, String dept) {
        switch (empID) {
            case 1:
                System.out.println("Yuvaraj");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                    case "Support":
                        System.out.println("Support Department.");
                        break;
                    default:
                        System.out.println("Enter a valid Department.");
                        break;
                }
                break;

            case 2:
                System.out.println("Jana");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                    case "Support":
                        System.out.println("Support Department.");
                        break;
                    default:
                        System.out.println("Enter a valid Department.");
                        break;
                }
                break;

            case 3:
                System.out.println("Vicky");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                    case "Support":
                        System.out.println("Support Department.");
                        break;
                    default:
                        System.out.println("Enter a valid Department.");
                        break;
                }
                break;

            default:
                System.out.println("Enter a valid EmpID.");
            }


        }
    }

