package SourceCode.LinearSearchAlgorthim_06;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = { 1, 312, 54, 17, 23, 11};
        System.out.println("Min--> " + min(arr));
        System.out.println("Max--> " + max(arr));
    }

    private static int max(int[] arr){
        if (arr.length == 0)
            return 0;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }

    private static int min(int[] arr) {
        if (arr.length == 0)
            return 0;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        return min;
    }


}
