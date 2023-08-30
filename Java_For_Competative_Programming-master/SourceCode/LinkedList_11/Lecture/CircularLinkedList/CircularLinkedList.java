package SourceCode.LinkedList_11.Lecture.CircularLinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int value) {
        Node temp = head;
        Node element = new Node(value);

        if (temp == null) {
            head = element;
            tail = element;
            return;
        }

        tail.next = element;
        element.next = head;
        tail = element;
    }

    public void delete() {

        if (head.next == null) {
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = temp.next.next;
    }

    public void display() {

        Node temp = head;

        if (head == null) return;

        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head) ;
        }

        System.out.println("HEAD");

    }


    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
