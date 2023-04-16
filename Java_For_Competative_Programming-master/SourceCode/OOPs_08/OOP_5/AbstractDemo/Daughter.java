package SourceCode.OOPs_08.OOP_5.AbstractDemo;

public class Daughter extends Parent{

    Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to become a Devops-Engineer.");
    }

    @Override
    void partner() {
        System.out.println("I love Thor!!!");
    }
}
