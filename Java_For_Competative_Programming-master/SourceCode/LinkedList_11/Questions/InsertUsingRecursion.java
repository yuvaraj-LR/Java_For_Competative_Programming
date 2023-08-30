package SourceCode.LinkedList_11.Questions;

import SourceCode.LinkedList_11.Lecture.SinglyLinkedList.SinglyLinkedList;

public class InsertUsingRecursion {

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.addAtFirst(51);
        ll.addAtFirst(42);
        ll.addAtFirst(39);
        ll.addAtFirst(26);

        ll.display();

        ll.insertRecursively(4, 15);

        ll.display();


    }
}
