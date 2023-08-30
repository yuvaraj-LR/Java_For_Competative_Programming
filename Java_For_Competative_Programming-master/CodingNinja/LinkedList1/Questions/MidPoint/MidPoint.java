package CodingNinja.LinkedList1.Questions.MidPoint;

import CodingNinja.LinkedList1.LL.Node;

import java.util.Scanner;

public class MidPoint {

    public static void main(String[] args) {
        Node<Integer> temp = getInput();
        temp = midPoint2(temp);

//        System.out.println(findCount(temp));

        System.out.println(temp.data);
    }

    public static int findCount(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here

        if (head == null || head.next == null) return head;

        int toFroward = findCount(head);

        Node<Integer> temp = head;

        if (toFroward % 2 == 0) {
            int count = 0;
            while (count < toFroward / 2 - 1 && temp != null) {
                temp = temp.next;
                count++;
            }
        } else {
            int count = 0;
            while (count < toFroward / 2 && temp != null) {
                temp = temp.next;
                count++;
            }
        }
        return temp;
    }

    public static Node<Integer> midPoint2 (Node<Integer> head) {
        if (head == null || head.next == null) return head;

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null || fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

