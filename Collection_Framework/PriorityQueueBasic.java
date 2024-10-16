import java.util.*;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(50);
        pq.offer(20);
        pq.offer(10);
        pq.offer(40);
        System.out.println("Queue is : "+pq);
        System.out.println("Front is : "+pq.peek());
        System.out.println("Deleted : "+pq.poll() );
        System.out.println("Queue is : "+pq);


    }
}
