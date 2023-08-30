package SourceCode.Recursion_09.BasicOfRecursion.Recursion;

public class RecursionExample {
    public static void main(String[] args) {
            print1(1);
        }

        static void print1(int n) {
            print2(2);
            System.out.println(n);
        }

        static void print2(int n) {
            print3(3);
            System.out.println(n);
        }

        static void print3(int n) {
            print4(4);
            System.out.println(n);
        }

        static void print4(int n) {
            System.out.println(n);
        }

}
