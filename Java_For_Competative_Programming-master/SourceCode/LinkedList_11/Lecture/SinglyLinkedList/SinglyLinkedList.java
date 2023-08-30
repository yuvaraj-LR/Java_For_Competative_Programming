package SourceCode.LinkedList_11.Lecture.SinglyLinkedList;

import SourceCode.LinkedList_11.Node;

public class SinglyLinkedList {
    public Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addAtFirst(int element) {
        size++;
        Node elem = new Node(element);

        elem.next = head;
        head = elem;

        if (tail == null) {
            tail = head;
        }
    }

    public void addAtLast(int element) {
        size++;
        Node elem = new Node(element);
        if (head == null) {
            head = tail;
            tail = elem;
            return;
        }

        tail.next = elem;
        tail = elem;
    }


    public void insertRecursively (int index, int value) {
        head = insertRecursively(index, value, head);
    }

    private Node insertRecursively(int index, int value, Node node) {
        if (index == 0) {
            Node element = new Node(value, node);
            size++;
            return element;
        }

        if (node == null) {
            // Handle case when index is out of bounds
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        node.next = insertRecursively(index - 1, value, node.next);
        return node;
    }


    public void addAtIndex(int index, int element) {
        size++;
        if (index == 0) {
            addAtFirst(element);
            return;
        }

        if (index == size) {
            addAtFirst(element);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node elem = new Node(element, temp.next);
        temp.next = elem;
    }

    public int deleteInFirst() {
        int value = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        size--;
        return value;
    }

    public int deleteInLast() {
        int value = tail.data;

        if (head.next == null) {
            deleteInFirst();
        }

        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        size--;
        return value;
    }

    public int deleteInIndex(int index) {
        if (index == 0) {
            return deleteInFirst();
        }

        if (index == size) {
            return deleteInLast();
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        int value = temp.next.data;
        temp.next = temp.next.next;

        size--;

        return value;
    }


//    public void addAtIndex(int index, int element) {
//        Node temp = head;
//        Node node = new Node(element);
//        Node prev = null;
//
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//            prev = temp.next;
//        }
//
//        node.next = prev;
//        temp.next = node;
//
//    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public void removeDuplicates() {
        Node temp = head;

        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public Node mergeArrays(SinglyLinkedList head1, SinglyLinkedList head2) {


        Node h1 = head1.head;
        Node h2 = head2.head;
        Node temp;

        if (h1.data <= h2.data ) {
            temp = h1;
            h1 = h1.next;
        } else {
            temp = h2;
            h2 = h2.next;
        }

        while (h1.next != null && h2.next != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
        }

        if (h1 != null) {
            temp.next = h1;
        } else {
            temp.next = h2;
        }

        return temp;
    }



}
