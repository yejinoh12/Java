package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        // add, peek, poll(stack의 pop)
        // 큐는 생성자가 없는 인터페이스

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q.size());

    }
}
