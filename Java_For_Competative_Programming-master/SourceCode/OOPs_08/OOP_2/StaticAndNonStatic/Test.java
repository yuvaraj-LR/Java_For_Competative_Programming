package SourceCode.OOPs_08.OOP_2.StaticAndNonStatic;


// Inside a static member we cannot able to call a non-static member.
public class Test {
    public static void main(String[] args) {
        // When a class has been started to run the static main class will run first.
        // Because the static does not depends on any other object.
        // For example we doesn't create a object for main. [Test t = new Test()]

        // If we need to access the a non-static method in a class.
        // We need to create a object for the class and access it through (.).
        Test t = new Test();
        t.test();
    }

    public void test() {
        System.out.println("Hello World!!!");
    }
}
