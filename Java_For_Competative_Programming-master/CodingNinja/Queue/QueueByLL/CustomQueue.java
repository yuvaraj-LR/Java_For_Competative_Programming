package CodingNinja.Queue.QueueByLL;

public class CustomQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    private int size;

    public CustomQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        return (T) front.data;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        size++;
        if(rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        T temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }
}
