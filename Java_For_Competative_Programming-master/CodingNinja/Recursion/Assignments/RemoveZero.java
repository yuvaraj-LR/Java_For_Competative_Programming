package CodingNinja.Recursion.Assignments;

public class RemoveZero {
    public static void main(String[] args) {
        System.out.println(countZerosRec(2000035808));
    }

    public static int countZerosRec(int n){
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            int rem = n % 10;

            if (rem == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
