package SourceCode.OOPs_08.OOP_3.Polymorphism;

public class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("Area of the triangle is 0.5 * breath * height");
    }
}
