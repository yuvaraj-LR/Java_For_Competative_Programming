package SourceCode.ArraysAndArrayList_05;

public class MaxiOfArray {
    public static void main(String[] args) {
        int[] arr = { 112, 52, 81, 97, 816};
        Maxi(arr);
    }

    private static void Maxi(int[] arr) {
        int max = arr[0];
        for (int element = 0; element < 5; element++) {
            if (arr[element] > max){
                max = arr[element];
            }
        }
        System.out.println(max);
    }
}
