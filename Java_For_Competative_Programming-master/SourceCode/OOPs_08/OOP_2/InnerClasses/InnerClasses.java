package SourceCode.OOPs_08.OOP_2.InnerClasses;

public class InnerClasses {
    static class Test {
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("Yuvaraj");
        Test t2 = new Test("Janagan");

        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
