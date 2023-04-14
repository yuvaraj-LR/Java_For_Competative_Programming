package SourceCode.OOPs_08.OOP_3.Inheritance;

public class Box {
    double length, height, width;

    //    Value for Default Constructor
    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

//    Value for Cube Constructor
    Box(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

//    Value for 3 Parameter Constructor.
    Box(double l, double h, double w) {
        this.length = l;
        this.height = h;
        this.width = w;
    }

//    Value for box type constructor.
    Box(Box other) {
        this.length = other.length;
        this.height = other.height;
        this.width = other.width;
    }
}


