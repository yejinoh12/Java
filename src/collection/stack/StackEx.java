package collection.stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        //push, peek, pop

        Stack<Integer> st = new Stack<Integer>();

        st.push(10);
        st.push(20);
        st.push(30);

        // 스택이 빌 때까지 출력
        // pop() Stack의 맨 위에 저장된 객체를 꺼낸다
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        st.push(10);
        st.push(20);
        st.push(30);

        //peek() 삭제 엇이 요소를 읽어온다
        System.out.println(st.peek());

        System.out.println(st.size());
    }
}
