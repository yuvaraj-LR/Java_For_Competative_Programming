package CodingNinja.Maps.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

        ArrayList<Integer> answer = longestConsecutiveIncreasingSequence(arr);
        System.out.println(answer);
    }

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        ArrayList<Integer> answerArray = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, true);
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentMax = 0;
            int currentElement = arr[i];
            int tempEnd = arr[i];

            while(map.containsKey(currentElement++)) {
                currentElement = currentElement + 1;
                map.put(currentElement, false);
                currentMax++;
            }

            currentElement = arr[i];
            int tempStart = arr[i];
            while(map.containsKey(currentElement--)) {
                currentElement = currentElement - 1;
                map.put(currentElement, false);
                currentMax++;
            }

            if (currentMax > maxLength) {
                start = tempStart;
                end = tempEnd;
            }
        }

        answerArray.add(start);
        answerArray.add(end);

        return answerArray;

    }

}
