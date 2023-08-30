package CodingNinja.OOPs1.Complex;

public class ComplexNumbers {
    // Complete this class
    int realNumber;
    int imaginaryNumber;

    public ComplexNumbers(int realNumber, int imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public void plus(ComplexNumbers c) {
        this.realNumber = this.realNumber + c.realNumber;
        this.imaginaryNumber = this.imaginaryNumber + c.imaginaryNumber;
    }

    public void multiply(ComplexNumbers c) {
        int real = this.realNumber * c.realNumber + (-1 * this.imaginaryNumber * c.imaginaryNumber);
        int imaginary = this.realNumber * c.imaginaryNumber + this.imaginaryNumber * c.realNumber;
        this.realNumber = real;
        this.imaginaryNumber = imaginary;
    }

    public void print() {
        System.out.println(realNumber + " + i" + imaginaryNumber);
    }
}
