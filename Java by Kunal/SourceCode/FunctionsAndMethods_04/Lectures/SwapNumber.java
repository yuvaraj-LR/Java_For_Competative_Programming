package SourceCode.FunctionsAndMethods_04;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        System.out.println(a + " " + b);

        swap(a, b);
    }

    static int swap(int a, int b) {
        int a1 = 10;
        int b1 = 30;

        int temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println(a1 + " " + b1);

        return(temp);
    }
}
