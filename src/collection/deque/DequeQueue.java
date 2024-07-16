package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueue {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("d = " + queue);

        System.out.println(queue.peek());

        System.out.println("d.pop() = " + queue.poll());
        System.out.println("d.pop() = " + queue.poll());
        System.out.println("d.pop() = " + queue.poll());



    }
}
