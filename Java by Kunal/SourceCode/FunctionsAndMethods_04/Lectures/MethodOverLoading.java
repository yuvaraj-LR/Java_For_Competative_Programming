package SourceCode.FunctionsAndMethods_04;

import java.util.Arrays;

public class MethodOverLoading {

    //  We call the demo method from how the arguments are passed.
    public static void main(String[] args) {
        demo();
        demo(1,2,3,4,5,6,7);
        demo('a', 'b', 'c', 'd', 'e', 'f');
    }

    static void demo() {
        System.out.println("Good");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(char ...v) {
        System.out.println(Arrays.toString(v));
    }
}
