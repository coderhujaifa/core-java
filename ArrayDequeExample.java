package Queue;

import java.util.*;

public class ArrayDequeExample {
	public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Front");
        deque.addLast("Back");
        deque.addLast("Back");

        System.out.println(deque);

        deque.removeFirst();  // removes "Front"
        deque.removeLast();   // removes "Back"

        System.out.println(deque);  // []
    }
}