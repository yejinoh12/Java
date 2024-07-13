package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String result = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 100000; i++) {
            //result += "Hello Java"; //String은 불변이므로 변경이 있을 때는 새로운 객체를 생성하는 과정이 있음
            sb.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();

        /**
         * 반목문 내에서의 문자열 연결은 런타임에 연결할 문자열의 개수과 내용이 결정된다.
         * 컴파일러는 얼마나 많은 반복이 일어날지, 각 반복문에서 문자열이 어떻게 변할지 예측할 수 없으므로
         * 최적화가 어렵게 됨
         */

        System.out.println("time: " + (endTime - startTime) + "ms"); //time: 7954ms -> time: 6ms

        /**
         * 문자열을 합칠 때 대부분의 경우 최적화가 돼서 + 연산을 사용하면 되지만
         * 반복문에서 반복해서 문자를 연결할 때, 조건문을 통해 동적으로 문자열을 조합할 때,
         * 복잡한 문자열의 특정 일부를 변경해야할 때, 매우 긴 대용량의 문자열을 다룰 때에는
         * StringBuilder 사용이 더 좋다.
         */

    }
}

