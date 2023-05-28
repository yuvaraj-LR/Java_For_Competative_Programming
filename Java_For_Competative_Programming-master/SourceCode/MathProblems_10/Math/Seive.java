package SourceCode.MathProblems_10.Math;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];
        seive(n, arr);
    }

    public static void seive(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
