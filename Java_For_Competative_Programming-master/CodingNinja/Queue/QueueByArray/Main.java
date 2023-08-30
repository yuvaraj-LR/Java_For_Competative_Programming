package CodingNinja.Queue.QueueByArray;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(15);
        queue.enqueue(98);
        queue.enqueue(54);
        queue.enqueue(67);

        queue.display();

        System.out.println(queue.getSize());

        queue.dequeue();
        queue.dequeue();

        for (int i = 1; i <= 15; i++) {
            queue.enqueue(5 * i);
        }

        queue.display();

    }
}
