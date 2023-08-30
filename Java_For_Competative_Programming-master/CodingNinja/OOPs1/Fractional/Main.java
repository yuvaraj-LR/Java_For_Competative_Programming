package CodingNinja.OOPs1.Fractional;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 6);

        f1.print();
//        f1.increment();
        f1.print();

        Fraction f2 = new Fraction(7, 9);

//        f1.add(f2);
//        f1.print();

        Fraction f3 = Fraction.add(f1, f2);
        f3.print();

    }
}
