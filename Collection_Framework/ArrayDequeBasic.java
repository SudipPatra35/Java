import java.util.*;
public class ArrayDequeBasic {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();
        adq.offer(50);
        adq.offer(20);
        adq.offer(10);
        adq.offer(40);
        adq.offerFirst(100);
        adq.offerLast(200);
        System.out.println("Queue is : "+adq);
        System.out.println("Front is : "+adq.peek());
        // System.out.println("Deleted : "+adq.poll() );
        System.out.println("Queue is : "+adq);
    }
}
