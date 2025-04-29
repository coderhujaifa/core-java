package Queue;

import java.util.*;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Arman");
        queue.add("Ziad");
        queue.add("Wqas");

        System.out.println(queue);
		
        System.out.println(queue.peek());  // give first value
        queue.remove();  //

        System.out.println(queue);
    }
}
