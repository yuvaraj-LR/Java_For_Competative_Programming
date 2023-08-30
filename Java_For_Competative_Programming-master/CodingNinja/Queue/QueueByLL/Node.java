package CodingNinja.Queue.QueueByLL;

public class Node<T> {
    Node<T> next;
    T data;

    public Node(Node<T> head, T data) {
        this.next = head;
        this.data = data;
    }

    public Node(T data) {
        this.data = data;
    }
}
