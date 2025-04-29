 package Queue;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
    	 PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println(pq);  
        System.out.println(pq.peek());    

        pq.remove();  
        System.out.println(pq); 
    }
}

