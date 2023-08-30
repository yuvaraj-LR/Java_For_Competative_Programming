package SourceCode.LinkedList_11.Lecture.DoublyLinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;

    public Node insertFirst(int data) {
        Node element = new Node(data);

        if (head == null) {
            tail = element;
        }

        element.next = head;
        element.prev = null;

        if (head != null) {
            head.prev = element;
        }

        head = element;
        return head;
    }

    public Node insertLast(int data) {
        Node element = new Node(data);

        if (tail == null) {
            head = element;
        }

        element.prev = tail;
        element.next = null;

        if (tail != null) {
            tail.next = element;
        }

        tail = element;

        return head;
    }

    public void addAtIndex(int index, int element) {
        if (index == 0) {
            insertFirst(element);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node elem = new Node(element);
        Node tempNext = temp.next;

        if (elem.next != null) {
            temp.next = elem;
            elem.prev = temp;

            tempNext.prev = elem;
            elem.next = tempNext;
        } else {
            insertLast(element);
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayInReverse() {
        System.out.println("Print in Reverse");
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }

        System.out.println("START");
    }



    public class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next, Node prev, int data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }
}
