package CodingNinja.Test3;

import java.util.Arrays;

public class MaximizeTheSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 15, 20, 25};
        int[] arr2 = { 2, 4, 5, 9, 15};

        System.out.println(Arrays.toString(new long[]{maximumSumPath(arr1, arr2)}));
    }

        // Utility function to find maximum of two integers
        public static int max(int x, int y) {
            return (x > y) ? x : y;
        }

        public static long maximumSumPath(int[] arr1, int[] arr2) {

            int m = arr1.length, n = arr2.length;

            int i = 0, j = 0;

            int sum1 = 0, sum2 = 0, result = 0;

            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    sum1 += arr1[j];
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    sum2 += arr2[j];
                    j++;
                } else {
                    result += max(sum1, sum2) + arr1[i];
                    sum1 = 0;
                    sum2 = 0;

                    i++;
                    j++;
                }
            }

            while (i < m) {
                sum1 += arr1[i];
                i++;
            }

            while (j < n) {
                sum2 = arr2[j];
                j++;
            }

            result += max(sum1, sum2);

            return result;

        }
    }

