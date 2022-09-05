package CollectionFramework;

import java.util.ArrayDeque;

import OOPS.Access.A;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offerLast(20);
        adq.offerLast(30);
        adq.offerFirst(5);
        System.out.println(adq);
        adq.poll();
        System.out.println(adq);
        adq.offerFirst(5);
        adq.pollLast();
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
    }
}
