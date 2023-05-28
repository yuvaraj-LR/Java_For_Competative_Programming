import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(maximumNumber(num));
    }

    private static int maximumNumber(int num) {
        int n = num;
        int ans = 0;

        for (int i = 0; i < 4; i++) {
            int temp = 0;
            int step = 1;

            for (int j = 0; j < 4; j++) {
                int rem = n % 10;

                if (i != j) {
                    temp += rem * step;
                    step *= 10;
                }
                n /= 10;
            }

            if (temp > ans) {
                ans = temp;
            }
            n = num;
        }
        return ans;
    }
}
