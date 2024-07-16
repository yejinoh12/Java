package collection.deque;

import java.util.ArrayDeque;

/**
 * Deque의 대표적인 구현체 : ArrayDeque, LinkedList 가 있음(LinkedList는 Deque, List 둘다 구현)
 * ArrayDeque,LinkedList 모두 앞, 뒤 입력 O(1)의 성능을 제공하지만 실제 사용 환경에서는 ArrayDeque가 더 빠름
 */

public class DequeMain {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //데이터 추가
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(4);
        System.out.println("dq = " + dq);

        dq.offerLast(9);
        dq.offerLast(2);
        dq.offerLast(6);
        System.out.println("dq = " + dq);

        //데이터 단순 조회
        System.out.println("dq.peekFirst() = " + dq.peekFirst());
        System.out.println("dq.peekLast() = " + dq.peekLast());

        //데이터 꺼내기
        System.out.println("dq.pollFirst() = " + dq.pollFirst());
        System.out.println("dq.pollLast() = " + dq.pollLast());
        System.out.println("dq = " + dq);


    }
}
