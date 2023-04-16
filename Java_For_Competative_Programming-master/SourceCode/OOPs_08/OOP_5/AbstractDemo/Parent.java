package SourceCode.OOPs_08.OOP_5.AbstractDemo;

// If single or multiple abstract method were present.  The class also be abstract.
public abstract class Parent {

//    We can use final variable in our class but cannot be able to finalize the
//    abstract method. Bcoz, it needed to override.

    int age;
    final int DEFAULT;

    public Parent(int age) {
        this.age = age;
        DEFAULT = 20;
    }

    abstract void career();
    abstract void partner();

//    We cannot be able to use constructor, static in a abstract method. Bcoz, the
//    method should be override in child class.


//    But we can call the static block element present in the abstract method.

    static void test(String name) {
        System.out.println("Welcome, " + name);
    }


}
