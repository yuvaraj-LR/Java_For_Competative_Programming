package CodingNinja.PriorityQueue;

import java.util.ArrayList;

public class PriorityQueue<T> {

    private ArrayList<Element<T>> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }

        return false;
    }

    public T getMin() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        return heap.get(0).value;
    }

    public void insert(T value, int priority) {

        Element<T> e = new Element<>(value, priority);
        heap.add(e);

        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);

                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;

            } else {
                return;
            }
        }
    }

    public T remove() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        T ans = heap.get(0).value;

        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while ( leftChildIndex < heap.size()) {
            int minIndex = parentIndex;

            if(heap.get(minIndex).priority < heap.get(leftChildIndex).priority) {
                minIndex = leftChildIndex;
            }

            if(rightChildIndex < heap.size() && heap.get(minIndex).priority < heap.get(rightChildIndex).priority) {
                minIndex = rightChildIndex;
            }

            if (minIndex == parentIndex) {
                return ans;
            }

            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }

        return ans;
    }


}
