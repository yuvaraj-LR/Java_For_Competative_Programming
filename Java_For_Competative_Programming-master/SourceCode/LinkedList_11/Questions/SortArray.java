//package SourceCode.LinkedList_11.Questions;
//
//import SourceCode.LinkedList_11.Lecture.SinglyLinkedList.SinglyLinkedList;
//import SourceCode.LinkedList_11.Node;
//
//public class SortArray {
//
//    public Node sort (Node head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        Node mid = middleNode(head);
//        Node left = sort(head);
//        Node right = sort(mid);
//
//        return mergeArrays(left, right);
//    }
//
//    public Node middleNode(SinglyLinkedList head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }
//    public Node mergeArrays(SinglyLinkedList head1, SinglyLinkedList head2) {
//
//
//        Node h1 = head1.head;
//        Node h2 = head2.head;
//        Node temp;
//
//        if (h1.data <= h2.data ) {
//            temp = h1;
//            h1 = h1.next;
//        } else {
//            temp = h2;
//            h2 = h2.next;
//        }
//
//        while (h1.next != null && h2.next != null) {
//            if (h1.data <= h2.data) {
//                temp.next = h1;
//                h1 = h1.next;
//            } else {
//                temp.next = h2;
//                h2 = h2.next;
//            }
//        }
//
//        if (h1 != null) {
//            temp.next = h1;
//        } else {
//            temp.next = h2;
//        }
//
//        return temp;
//    }
//
//}
