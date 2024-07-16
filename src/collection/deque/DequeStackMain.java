package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque에서 Stack을 위한 메서드 이름까지 제공함
 * Stack 자료구조 필요시 Deque에서 ArrayDeque 구현체를 사용할 것
 */
public class DequeStackMain {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("d = " + stack);

        System.out.println(stack.peek());

        System.out.println("d.pop() = " + stack.pop());
        System.out.println("d.pop() = " + stack.pop());
        System.out.println("d.pop() = " + stack.pop());


    }
}
