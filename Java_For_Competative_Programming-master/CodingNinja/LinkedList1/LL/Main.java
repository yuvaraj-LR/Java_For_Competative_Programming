package CodingNinja.LinkedList1.LL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node<Integer> ll = getInput();
//        Node<Integer> insertElementInNode = insert(ll, 21, 2);
//        Node<Integer> removeElementInNode = remove(ll, 3);
//        print(removeElementInNode);
//        printReverse(ll);
//        print(ll);
//        ll = inserting(ll, 50, 0);
//        print(ll);
//        printR(ll)
    }

    public static Node<Integer> deleting(Node<Integer> head, int position) {

        if (head == null) {
            return head;
        }

        if (position == 0) {
            return head.next;
        }

        head.next = deleting(head.next, position - 1);

        return head;
    }

    public static Node<Integer> inserting(Node<Integer> head, int elem, int index) {

        if (head == null && index > 0) {
            return head;
        }

        if (index == 0) {
            Node<Integer> element = new Node<>(elem);
            element.next = head;

            return element;
        } else {
            head.next = inserting(head.next, elem, index - 1);
            return head;
        }
    }

    public static void printReverse(Node<Integer> root) {
        //Your code goes here
        if (root == null) return;

        if (root.next == null) {
            System.out.print(root.data + " ");
            return;
        }
        printReverse(root.next);
        System.out.print(root.data + " ");
    }

    public static Node<Integer> remove(Node<Integer> head, int position) {
//        Node<Integer> insertElement = new Node<>(element);
        
        if (position == 0) {
            return head.next;
        }

        else {
            int count = 0;
            Node<Integer> previous = head;

            while(count <= position - 1 && previous != null) {
                count++;
                previous = previous.next;
            }

            if (previous != null) {
                head.next = previous.next;
                previous.next = head;
            }

            return head;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int element, int position) {
        Node<Integer> insertElement = new Node<>(element);

        if (position == 0) {
            insertElement.next = head;
            return insertElement;
        }

        else {
            int count = 0;
            Node<Integer> previous = head;

            while(count < position - 1 && previous != null) {
                count++;
                previous = previous.next;
            }

            if (previous != null) {
                insertElement.next = previous.next;
                previous.next = insertElement;
            }

            return head;
        }
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static Node<Integer> getInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);

            if (head == null) {
                 head = currentNode;
            } else {
                Node<Integer> tail = head;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = currentNode;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static Node<Integer> getInput1() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }

        return head;
    }
    
}
