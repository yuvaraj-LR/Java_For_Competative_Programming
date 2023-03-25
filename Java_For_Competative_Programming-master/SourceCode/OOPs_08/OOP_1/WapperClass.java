package SourceCode.OOPs_08.OOP_1;

public class WapperClass {
    public static void main(String[] args) {

        // If the objects are in the primitive data type there is no changes occur
        // in the function.
        int a = 10;
        int b = 20;
        swap(a, b);

        // What happen if we use wapper class

        // This also the scope of the function was within that method.
        Integer num1 = 10;
        Integer num2 = 20;
        swap(num1, num2);

        System.out.println(num1);
        System.out.println(num2);
    }

    public static void swap(int a, int b) {
        // Here, the scope of the function was within this method.  So, there is no
        // change occur in the main method.
        int temp = a;
        a = b;
        b = temp;
    }
}
