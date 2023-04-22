package SourceCode.OOPs_08.OOP_6.CloneObject;

public class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human (Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
