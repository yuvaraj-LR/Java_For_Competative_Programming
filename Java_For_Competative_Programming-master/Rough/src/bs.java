// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class bs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 5));
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            }

            else if(arr[mid] > target) {
                high = mid - 1;
            }

            else {
                return mid;
            }
        }

        return 0;
    }
}
