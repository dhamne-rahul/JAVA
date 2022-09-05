package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();//inbuilt it is a min-heap.
        // pq.offer(34);
        // pq.offer(22);
        // pq.offer(55);
        // pq.offer(12);
        // System.out.println(pq);
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//max heap is created.
        pq.offer(34);
        pq.offer(22);
        pq.offer(55);
        pq.offer(12);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());




    }
}
