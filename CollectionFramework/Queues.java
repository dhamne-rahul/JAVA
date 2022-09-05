package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        List<Integer> list=new ArrayList<>();//we can implement list from arraylist.
        
        
    }
}
