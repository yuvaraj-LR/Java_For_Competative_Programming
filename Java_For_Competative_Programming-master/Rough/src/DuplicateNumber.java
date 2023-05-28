public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 2, 3, 1};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 1; j < arr.length; j++) {
            for (int k = j; k < arr.length; k++) {
                if (arr[j] == arr[k]) return arr[j];
            }
        }

        return 0;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
