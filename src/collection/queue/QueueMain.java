package collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //ArrayDeque<Integer> queue = new LinkedDeque<>(); 사용가능하지만 ArrayDeque가 더 빠름

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);

        //다음 꺼낼 데이터 단순 조회
        System.out.println("queue.peek() = " + queue.peek());

        //데이터 꺼냄
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);

    }
}
