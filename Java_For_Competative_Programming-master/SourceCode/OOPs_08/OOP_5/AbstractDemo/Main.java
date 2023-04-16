package SourceCode.OOPs_08.OOP_5.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(55);
        son.career();

        // We have override the properties of the Son & Daughter Classes.
        Daughter daughter = new Daughter(22);
        daughter.career();

//        Suppose we need to call the abstract class, we need the methods here to override.
//        Parent parent = new Parent() {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        }

//        Here, we are calling the static method in a abstract class.
//        Parent.test("Yuvaraj");


    }
}
