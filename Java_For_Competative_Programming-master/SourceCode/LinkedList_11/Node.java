package SourceCode.LinkedList_11;

public class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public class SinglyLinkedList {
        private Node head;
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

            if (head == null) {
                addAtFirst(element);
                return;
            }
            Node elem = new Node(element);

            tail.next = elem;
            tail = elem;
        }

        public void addAtIndex(int index, int element) {
            size++;
            if (index == 0) {
                addAtFirst(element);
                return;
            }

            if (index == size) {
                addAtLast(element);
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

        public void display() {
            Node temp = head;

            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("END");
        }
    }
}

