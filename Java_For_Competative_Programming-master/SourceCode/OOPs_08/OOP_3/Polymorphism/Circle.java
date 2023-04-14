package SourceCode.OOPs_08.OOP_3.Polymorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area of the circle is pie * radius * radius");
    }
}
