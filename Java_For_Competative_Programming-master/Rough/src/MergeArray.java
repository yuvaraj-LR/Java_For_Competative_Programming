import java.util.Arrays;

public class MergeArray {
    public static int[] merge(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        System.out.println(n1 + " " + n2);

        int[] answerArray = new int[n1 + n2];

        for (int i = 0; i <= answerArray.length - 1; i++) {
            if (i < arr1.length) {
                answerArray[i] = arr1[i];
            } else {
                answerArray[i] = arr2[answerArray.length - i -1];
            }
        }

        Arrays.sort(answerArray);
        return answerArray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 2, 3, 1};
        int[] arr2 = { 9, 22, 11, 10, 15};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }



}
