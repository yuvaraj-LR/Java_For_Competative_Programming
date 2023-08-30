package CodingNinja.LinkedList1.Questions.MergeSort;

import CodingNinja.LinkedList1.LL.Node;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        System.out.print("Enter L1 's data: ");
        Node<Integer> l1 = getInput();
        System.out.print("Enter L2 's data: ");
        Node<Integer> l2 = getInput();

        Node<Integer> output = mergeTwoSortedLinkedLists(l1, l2);
        print(output);
    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> l1, Node<Integer> l2) {

        if (l1 == null || l2 == null) return null;

        Node<Integer> head;
        Node<Integer> tail;

        if (l1.data <= l2.data) {
            head = l1;
            tail = l1;
            l1 = l1.next;
        } else {
            head = l2;
            tail = l2;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        return head;
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
