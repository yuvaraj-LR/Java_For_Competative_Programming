package SourceCode.LinkedList_11.Lecture.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

//        dll.insertFirst(50);
        dll.insertFirst(61);
        dll.insertFirst(29);
//        dll.insertFirst(95);
//
//        dll.display();
//        dll.displayInReverse();

        dll.insertLast(60);
        dll.insertLast(83);
        dll.insertLast(91);
        dll.insertLast(72);

        dll.display();

        dll.addAtIndex(6, 5);

        dll.display();

    }
}
