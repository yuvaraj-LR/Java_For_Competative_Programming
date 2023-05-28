public class PairSum {
    public static void main(String[] args) {

        int[] arr = {3, 3, 3, 3, 3};
        int x = 6;
        int n = arr.length-1;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
