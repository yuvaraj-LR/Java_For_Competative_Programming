package SourceCode.OOPs_08.OOP_2.IntilationOfStatic;

public class StaticIntilizer {
    static int a = 20;
    static int b;

    static {

        // This will run once because the static block will always runs once
        // in the class loaded.

        // The value changes for the variables will change the values
        // in every occurances.

        System.out.println("I am in static block.");
        b = a * 2;
    }

    public static void main(String[] args) {
        System.out.println(StaticIntilizer.a + " " + StaticIntilizer.b);

        // The value will be changed once the static block call once.
        StaticIntilizer si = new StaticIntilizer();
        si.b += 10;
        System.out.println(StaticIntilizer.a + " " + StaticIntilizer.b);

        // This will affect the whole static block and its occurances.
        StaticIntilizer si1 = new StaticIntilizer();
        System.out.println(StaticIntilizer.a + " " + StaticIntilizer.b);
    }
}
