package CodingNinja.LinkedList1.Questions;

import CodingNinja.LinkedList1.LL.Node;

import java.util.Scanner;

public class LinkedListTemplate {

    public static void main(String[] args) {
        Node<Integer> temp = getInput();

        print(temp);
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

}

