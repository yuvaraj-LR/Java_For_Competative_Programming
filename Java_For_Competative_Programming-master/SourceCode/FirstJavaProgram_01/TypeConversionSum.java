package SourceCode.FirstJavaProgram_01;

public class TypeConversionSum {
    public static void main(String[] args) {
        byte b = 12;
        char c = 'g';
        short s = 1443;
        long l = 3245423;
        float f = 67.343f;
        double d = 8438.273;
        double result = (b * d) + (s - c) - (l + f);

        System.out.println("(b * d)" + "(s-c)" + "(l+f)");
        System.out.println("Result -> " + result );
    }
}
