public class XORSort {
    public static int convertIntoDecimal(long num) {

        int decimalValue = 0;
        int increamentValue = 0;

        while (num != 0) {
            int rem = (int)num % 10;
            decimalValue = decimalValue + (rem * (int)Math.pow(2, increamentValue));
            increamentValue++;

            num /= 10;
        }
        return decimalValue;
    }

    public static long convertIntoBinary(int n) {

        long placeValue = 1;
        long ans = 0l;

        while (n != 0) {
            int rem = n % 2;
            ans += rem * placeValue;
            placeValue *= 10;

            n /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 ^ num2);

        long binaryNum1 = convertIntoBinary(num1);
        long binaryNum2 = convertIntoBinary(num2);
        long binary = binaryNum1 ^ binaryNum2;

        int decimal = convertIntoDecimal(binary);

        System.out.println(decimal);
    }
}
