package SourceCode.LinkedList_11.Lecture.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(15);
        cll.insert(25);
        cll.insert(19);
        cll.insert(82);
        cll.insert(6);

        cll.display();

        cll.delete();

        cll.display();

    }
}
