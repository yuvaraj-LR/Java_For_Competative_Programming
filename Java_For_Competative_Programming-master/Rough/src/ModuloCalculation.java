package SourceCode.OOPs_08.OOP_2.Packages.a.b;

public class ModuloCalculation {
    public static void main(String[] args) {
        System.out.println(solve(2, 10, 7, 10));
    }

    public static int solve(int a, int b, int c, int m){
        // Write your code here.
        int power = (int) Math.pow(a, b);
        int divide = power / c;
        int gcd = divide % m;

        return gcd;
    }
}
