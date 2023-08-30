package SourceCode.StackAndQueue_12.Lecture.CircularQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue cQueue = new CircularQueue();

        cQueue.add(52);
        cQueue.add(75);
        cQueue.add(44);
        cQueue.add(23);
        cQueue.add(90);
        cQueue.add(81);
        cQueue.add(63);


        cQueue.add(75);
        cQueue.add(44);
        cQueue.add(23);
        cQueue.add(90);
        cQueue.add(81);
        cQueue.add(63);

        cQueue.display();

        cQueue.remove();
        cQueue.remove();

        cQueue.display();
        System.out.println(cQueue.size);
        
    }


}
