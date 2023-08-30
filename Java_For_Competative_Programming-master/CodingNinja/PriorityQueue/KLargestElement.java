package CodingNinja.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {

    public static ArrayList<Integer> kLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while (!pq.isEmpty()) {
            answer.add(pq.poll());
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
        int k = 4;

        System.out.println( kLargestElement(arr, k));

    }


}
