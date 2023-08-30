package CodingNinja.LinkedList1.Linkedlist;

import java.util.Scanner;

public class Main {

    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> l1 = new LinkedList<>(20);
        LinkedList<Integer> l2 = new LinkedList<>(40);
        LinkedList<Integer> l3 = new LinkedList<>(60);
        LinkedList<Integer> l4 = new LinkedList<>(80);

        l1.node = l2;
        l2.node = l3;
        l3.node = l4;

        return l1;
    }

    public static void print(LinkedList<Integer> head) {
//       This is the method-1 to print the data.
//        System.out.println(head.data);
//        System.out.println(head.node.data);
//        System.out.println(head.node.node.data);
//        System.out.println(head.node.node.node.data);

//        This is the method-2 to print the data.

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.node;
        }
    }

    public static LinkedList<Integer> inputNode() {
        Scanner sc = new Scanner(System.in);
        int data  = sc.nextInt();

        LinkedList<Integer> head = null, tail = null;
        while (data != -1) {
            LinkedList<Integer> currNode = new LinkedList<>(data);

            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
//                LinkedList<Integer> tail = head;
//
//                while (tail.node != null) {
//                    tail = tail.node;
//                }
                tail.node = currNode;
                tail = currNode;

            }

            data = sc.nextInt();
        }

        return head;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>(20);
//        System.out.println(list.data);
//        System.out.println(list.node);

//        LinkedList<Integer> head = createLinkedList();
//        System.out.println(head.data);
//        System.out.println(head.node);

        LinkedList<Integer> head = inputNode();
        print(head);
    }
}
