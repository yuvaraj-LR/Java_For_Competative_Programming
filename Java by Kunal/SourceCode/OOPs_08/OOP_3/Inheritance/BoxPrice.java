package SourceCode.OOPs_08.OOP_3.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice () {
        this.price = -1;
    }

    BoxPrice(double price) {
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
