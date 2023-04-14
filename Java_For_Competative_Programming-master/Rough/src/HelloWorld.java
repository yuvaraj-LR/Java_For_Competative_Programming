// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class HelloWorld {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pattern8(n);
    }

    static void pattern8(int n) {
        for (int i=1; i<n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print("* ");
            }

            for (int j=1; j<i; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<i ; j++) {
                System.out.print("  ");
            }

            for (int j=i; j<n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i=1; i<n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            for (int j=i; j<n; j++) {
                System.out.print("  ");
            }

            for (int j=i; j<n; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
//
    }
//    for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }

    static void pattern1(int n) {
        //Row 
        for(int i=1; i<=n; i++) {
            //Column
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
//for (int j=i; j<=n; j++) {
//        System.out.print("  ");
//    }
//
//            for (int j=1; j<=i; j++) {
//        System.out.print("* ");
//    }
    static void pattern2(int n) {
        //Row 
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=i; j<=n; j++) {
                System.out.print("  ");
            }

            //Columns
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern3(int n) {
        //Row
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=i; j<=n; j++) {
                System.out.print("  ");
            }

            //Columns
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }

            //Columns
            for(int k=1; k<i; k++) {
                System.out.print("  ");
            }

            //Column
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int i=1; i<=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for(int i=1; i<n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


}