package CodingNinja.LinkedList1.Questions.ReverseLL;

import CodingNinja.LinkedList1.LL.Node;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Node<Integer> head = getInput();
        print(printByDouble(head));
    }

    public static Node<Integer> printByDouble(Node<Integer> head) {
        DoubleNode reverse = printByDoubleNode(head);

        return reverse.head;
    }

    public static DoubleNode printByDoubleNode(Node<Integer> head) {
        DoubleNode ans;

        if (head.next == null) {
            ans = new DoubleNode(head, head);
            return ans;
        }

        DoubleNode smallHead = printByDoubleNode(head.next);
        smallHead.tail.next = head;
        head.next = null;

        ans = new DoubleNode(smallHead.head, head);
        return ans;
    }

    public static Node<Integer> printR(Node<Integer> head) {

        Node<Integer> temp = head;

        Node<Integer> reverse = head;
        reverse.next = null;

        for (int i = 5; i > 1; i--) {
            if (temp != null) {
                for (int j = 1; j < i; j++) {
                    temp = temp.next;
                }
            }

            reverse = temp;
            reverse.next = temp;
        }

        return reverse;
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
    public static class DoubleNode {

        public Node<Integer> head;
        Node<Integer> tail;

        public DoubleNode(Node<Integer> head, Node<Integer> tail) {
            this.head = head;
            this.tail = tail;
        }
    }
}
