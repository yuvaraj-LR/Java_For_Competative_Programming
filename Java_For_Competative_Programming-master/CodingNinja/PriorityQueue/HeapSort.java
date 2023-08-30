package CodingNinja.PriorityQueue;

public class HeapSort {

    public static void downify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < n) {
            int minIndex = parentIndex;

            if(arr[leftChildIndex] < arr[minIndex]) {
                minIndex = leftChildIndex;
            }

            if(arr[rightChildIndex] < n && arr[rightChildIndex] < arr[minIndex]) {
                minIndex = rightChildIndex;
            }

            if (minIndex == parentIndex) {
                return;
            }

            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
    }

    public static void inplaceHeapSort(int arr[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Change in the given input itself.
         * Taking input and printing output is handled automatically.
         */

        int n = arr.length;

        for(int i = n/2 - 1; i >= 0; i--) {
            downify(arr, i, n - 1);
        }

        for(int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            downify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};

        inplaceHeapSort(arr);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
