package CodingNinja.LinkedList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        ArrayList<Integer> ansList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ansList.add(arr[i]);
            }
        }

        ansList.add(arr[arr.length - 1]);

        System.out.println(ansList);
    }


}
