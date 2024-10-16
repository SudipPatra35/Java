import java.util.LinkedList;
import java.util.Queue;
// Queue using LinkedList
public class QueueBasic {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>() ;
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue is : "+queue);
        System.out.println("Front is : "+queue.peek());
        System.out.println("Deleted : "+queue.poll() );
    }
}
