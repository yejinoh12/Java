package lang.string.chaining;

public class MethodChainingMain3 {

    /**
     * 메서드 체이닝
     * 메서드 호출의 결과로 자기 자신의 참조값을 반환하면 반환된 참조값을 사용해서 메서드 호출을 계속 이어갈 수 있게 됨
     * 메서드를 호출 할 때마다 변수명에 .을 찍지 않고, 끝나는 시점에 .을 찍어서 변수명을 생략할 수 있음
     * -> 코드를 간결하고 읽기 쉬워짐
     */
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println(result);
    }
}
