package SourceCode.MathProblems_10.BitManipulation;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, -3, 2, 1};

        System.out.println(uniqueNumber(arr));
    }

    private static int uniqueNumber(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
