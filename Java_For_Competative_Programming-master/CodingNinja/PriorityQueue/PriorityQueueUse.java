package CodingNinja.PriorityQueue;

public class PriorityQueueUse {
    public static void main(String[] args) throws Exception {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.insert("abc", 91);
        pq.insert("idj", 42);
        pq.insert("qwx", 73);
        pq.insert("fes", 85);
        pq.insert("bes", 12);

        while(!pq.isEmpty()) {
            System.out.println(pq.getMin());
            pq.remove();
        }
    }
}
