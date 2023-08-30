package SourceCode.StackAndQueue_12.Lecture.CustomQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.add(24);
        queue.add(85);
        queue.add(42);
        queue.add(21);
        queue.add(90);
        queue.add(75);
        queue.add(85);
        queue.add(42);
        queue.add(21);
        queue.add(90);
        queue.add(75);

        queue.display();

        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();

    }
}
