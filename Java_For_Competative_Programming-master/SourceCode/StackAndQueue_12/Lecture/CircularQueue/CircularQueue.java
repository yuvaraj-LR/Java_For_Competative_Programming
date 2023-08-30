package SourceCode.StackAndQueue_12.Lecture.CircularQueue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int end = 0;
    int front = 0;
    int size = 0;
    public CircularQueue() {
        data = new int[DEFAULT_CAPACITY];
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end < 0;
    }

    public boolean add(int element) {
       if (isFull()) {
           int[] temp = new int[data.length * 2];

           for (int i = 0; i < data.length; i++) {
               temp[i] = data[(front + i) % data.length];
           }

           front = 0;
           end = data.length;

           data = temp;
       }

        data[end++] = element;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception();
        }

        int temp = data[front++];
        front %= data.length;
        size--;
        return temp;

    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        int index = front;

        do {
            System.out.print(data[index] + " -> ");
            index++;
            index %= data.length;

        } while (index != end);

        System.out.println("End");
    }
}
