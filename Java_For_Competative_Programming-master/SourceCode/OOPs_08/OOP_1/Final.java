package SourceCode.OOPs_08.OOP_1;

public class Final {
    public static void main(String[] args) {

        // Final - is the keyword used to set the constant variables.
        // Once the final keyword was set and cannot able to modify in primitive
        // data type.

        final int PRICE = 20000;

        // If we try to change the value, this will give us error.
        // PRICE = 400;

        // But if we use it for the referenced data type, we can able to assign the
        // value for once.  If once assigned and cannot able to reassign.

        //Here, we already defined a value for str.
        final A a = new A("Yuvaraj");

        // Eventhough it was in referenced data type, the value can be assigned.
        a.s = "yuva";
        System.out.println(a.s);

        // We cannot able to reassign it.
        // a = new A("New object");


    }
}

class A {
    String s;

    public A() {
        this.s = "yuva";
    }

    public A(String str) {
        this.s = str;
    }
}
