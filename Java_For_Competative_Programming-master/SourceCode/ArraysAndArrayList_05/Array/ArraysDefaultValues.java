package SourceCode.ArraysAndArrayList_05.Array;

public class ArraysDefaultValues {
    public static void main(String[] args) {

        //Creating a int array with 5 elements.
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();

        //Creating a string array with 5 elements.
        String[] stArr = new String[5]; {
            for (int i = 0; i < stArr.length; i++) {
                System.out.print(stArr[i] + " ");
            }
        }
    }
}
