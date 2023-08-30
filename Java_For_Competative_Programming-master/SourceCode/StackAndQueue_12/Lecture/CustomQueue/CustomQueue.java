package SourceCode.StackAndQueue_12.Lecture.CustomQueue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int end = 0;
    public CustomQueue() {
        data = new int[DEFAULT_CAPACITY];
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean add(int element) {
        if (isFull()) {
            int[] temp = new int[(data.length - 1) * 2];

            for (int i = 0; i < data.length - 1; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        data[end++] = element;
        return true;
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int removedElement = data[0];

        for (int i = 1; i < data.length - 1; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return removedElement;
    }

    public boolean isEmpty() {
        return end < 0;
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }

        System.out.println("End");
    }
}
