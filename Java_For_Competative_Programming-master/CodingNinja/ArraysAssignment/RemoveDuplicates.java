package CodingNinja.ArraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter how many numbers you want? ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        getInput(arr, n);
        ArrayList<Integer> ansArray = printTheSortedArray(arr, n);

        System.out.println(ansArray);

    }

    public static void getInput(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            System.out.print("Enter " + i + " th number: ");
            arr[i-1] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("After Sorting the Input: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> printTheSortedArray(int[] arr, int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        for (; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ans.add(arr[i]);
            }
        }

        if (arr[i] != arr[arr.length - 1]) {
            ans.add(arr[arr.length - 1]);
        }

        return ans;
    }
}
