package SourceCode.OOPs_08.OOP_3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();


        circle.area();
        square.area();

    }
}
