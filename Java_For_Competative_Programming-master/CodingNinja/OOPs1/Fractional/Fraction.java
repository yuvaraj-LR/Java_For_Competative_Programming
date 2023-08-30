package CodingNinja.OOPs1.Fractional;

public class Fraction {
    int numerator;
    int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int max = Math.max(numerator, denominator);

        for (int i = 2; i < max; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }

        numerator /= gcd;
        denominator /= gcd;
    }

    public void increment() {
        this.numerator = numerator + denominator;
        simplify();
    }

    public void add(Fraction fr) {
        this.numerator = this.numerator * fr.denominator + this.denominator * fr.numerator;
        this.denominator = this.denominator * fr.denominator;
        simplify();
    }

    public void print(){
        System.out.println("Numerator " + "/" + " Denominator : " + (numerator) + " / " + (denominator));
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;

        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }
}
