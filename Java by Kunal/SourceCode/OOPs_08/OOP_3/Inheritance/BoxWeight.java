package SourceCode.OOPs_08.OOP_3.Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public static void main(String[] args) {
        Box box = new Box(5);
//        int n = box.num;
    }
}
