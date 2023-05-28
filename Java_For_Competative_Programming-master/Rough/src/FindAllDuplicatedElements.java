import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatedElements {
    public static void findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> answerArray = new ArrayList<>();
        for (int j = 0; j <= arr.length - 1; j++) {

            if (arr[j] != j + 1) {
                answerArray.add(arr[j]);
            }
        }

        System.out.println(answerArray);

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4, 5, 2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
