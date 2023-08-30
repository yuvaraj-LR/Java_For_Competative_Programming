package CodingNinja.Queue.QueueByLL;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.enqueue(15);
        queue.enqueue(98);
        queue.enqueue(54);
        queue.enqueue(67);

        System.out.println(queue.size());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.size());

//
//        for (int i = 1; i <= 15; i++) {
//            queue.enqueue(5 * i);
//        }
//
//        queue.print();
    }
}
