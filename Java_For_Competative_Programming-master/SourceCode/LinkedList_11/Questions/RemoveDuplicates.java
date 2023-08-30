package SourceCode.LinkedList_11.Questions;

import SourceCode.LinkedList_11.Lecture.SinglyLinkedList.SinglyLinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addAtFirst(1);
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(3);
        ll.addAtFirst(3);
        ll.addAtFirst(4);

        ll.display();

        ll.removeDuplicates();

        ll.display();

    }
}
