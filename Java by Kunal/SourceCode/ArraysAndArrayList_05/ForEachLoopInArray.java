package SourceCode.ArraysAndArrayList_05;

public class ForEachLoopInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) { //for every element in array, print the element.
            System.out.print(num + " "); // Here num represents element of the array.
        }
    }
}
