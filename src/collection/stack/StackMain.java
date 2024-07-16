package collection.stack;

import java.util.Stack;

/**
 * Stack 클래스는 사용 x
 * 클래스 내부에서 Vector 라는 자료구조를 사용하는데 지금은 사용되지 않고 하휘호환을 위해 존재
 * Deque 사용 권장.
 */
public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        //다음 꺼낼 요소 조회
        System.out.println("stack.peek() = " + stack.peek());

        //스택 제거
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
