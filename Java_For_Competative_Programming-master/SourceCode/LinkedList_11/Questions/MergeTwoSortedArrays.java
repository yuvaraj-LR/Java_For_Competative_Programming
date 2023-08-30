package SourceCode.LinkedList_11.Questions;

import SourceCode.LinkedList_11.Lecture.SinglyLinkedList.SinglyLinkedList;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.addAtFirst(7);
        l1.addAtFirst(5);
        l1.addAtFirst(3);
        l1.addAtFirst(1);

        System.out.println("Display L1 : ");
        l1.display();

        SinglyLinkedList l2 = new SinglyLinkedList();
        l2.addAtFirst(10);
        l2.addAtFirst(8);
        l2.addAtFirst(6);
        l2.addAtFirst(4);
        l2.addAtFirst(2);

        System.out.println("Display L2 : ");
        l2.display();

        SinglyLinkedList temp = new SinglyLinkedList();
        temp.mergeArrays(l1, l2);
        temp.display();


    }

}
