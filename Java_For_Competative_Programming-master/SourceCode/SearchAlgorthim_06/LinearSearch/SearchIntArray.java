package SourceCode.SearchAlgorthim_06.LinearSearch;

public class SearchIntArray {
    public static void main(String[] args) {
        int[] num = {12, 34, 65, 85, 11};
        int target = 65;

        System.out.println(SerchingElement(num, target));
        System.out.println(SerchingIndex(num, target));
        System.out.println(SerchingBoolean(num, target));
    }

    //Searching the target in arr, If founded return the element.
    //Otherwise, return -1
    static int SerchingElement(int[] arr, int tar) {
        if (arr.length == 0)
            return -1;

        for (int element : arr) {
            if (element == tar)
                return element;
        }
        return -1;
    }

    //Searching the target in arr, If founded return the index.
    //Otherwise, return -1
    static int SerchingIndex(int[] arr, int tar) {
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == tar)
                return index;
        }
        return -1;
    }

    //Searching the target in arr, If founded return true.
    //Otherwise, return false
    static boolean SerchingBoolean(int[] arr, int tar) {
        if (arr.length == 0)
            return false;

        for (int element : arr) {
            if (element == tar)
                return true;
        }
        return false;
    }

}
