package SourceCode.ControlStatementsAndLoops_02;

public class ReverseTheNumber {
    public static void main(String[] args) {
        mymethod();
    }

    private static void mymethod() {
        int n = 55443366;
        int num = 0;

        while (n > 0){
            int rev = n % 10;
            num = (num * 10) + rev;
            n /= 10;
        }

        System.out.println(num);
    }
}
