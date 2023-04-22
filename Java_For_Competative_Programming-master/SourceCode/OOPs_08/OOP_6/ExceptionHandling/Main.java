package SourceCode.OOPs_08.OOP_6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            try{
                divide(a, b);
            } catch (ArithmeticException e) {
                throw new RuntimeException(e);
            }
            divide(a, b);

        } catch (Exception e) {
//            System.out.println("Cannot able to divide by zero.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always display.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Cannot Divide by zero");
        }

        return a/b;
    }

}
