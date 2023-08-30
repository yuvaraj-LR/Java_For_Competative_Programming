package CodingNinja.Stack.StackByLL;

public class CustomStack<T> {
    private Node<T> head;
    private int size;

    public CustomStack() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return head.data;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        T temp = head.data;

        head = head.next;
        size--;

        return temp;
    }
}
