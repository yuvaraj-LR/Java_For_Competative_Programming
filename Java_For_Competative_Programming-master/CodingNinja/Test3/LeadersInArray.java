package CodingNinja.Test3;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {3, 12, 34, 2, 0, -1};

        ArrayList<Integer> answerArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isGreater = false;
            for (int j = i; j < arr.length - 1; j++ ) {
                if (arr[i] >= arr[j + 1]) {
                    isGreater = true;
                } else {
                    isGreater = false;
                    break;
                }
            }

            if (isGreater == true) answerArray.add(arr[i]);
        }

        answerArray.add(arr[arr.length - 1]);

        for (int i = answerArray.size() - 1; i >= 0 ; i--) {
            System.out.print(answerArray.get(i) + " ");
        }

//        System.out.print(answerArray);

    }
}
