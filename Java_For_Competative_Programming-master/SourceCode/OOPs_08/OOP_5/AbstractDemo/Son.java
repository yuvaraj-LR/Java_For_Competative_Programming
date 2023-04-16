package SourceCode.OOPs_08.OOP_5.AbstractDemo;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to become a full-stack Developer.");
    }

    @Override
    void partner() {
        System.out.println("I love Scarlet Witch!!!");
    }
}
