package CodingNinja.Queue.QueueByArray;

public class CustomQueue {
    private int[] data;
    private static final int CAPACITY = 5;
    private int front = 0, rear = 0;
    private int size = 0;

    public CustomQueue() {
        data = new int[CAPACITY];
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }

        return data[front];
    }

    public void enqueue(int element) {
        if (rear == data.length - 1) {
            int[] temp = new int[(data.length) * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
//        rear = (rear + 1) % data.length;
        data[rear++] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int temp = data[front];

//        front = (front + 1) % data.length;
        front++;
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        size--;
        rear--;
        return temp;
    }

    public void display() {
        for (int i = 0; i < rear; i++) {
            System.out.print(data[i] + "->");
        }
        System.out.println("END");
    }
}
