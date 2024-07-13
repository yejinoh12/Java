package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        ValueAdder a1 = adder.add(1);
        ValueAdder a2 = adder.add(2);
        ValueAdder a3 = adder.add(3);

        int result = a3.getValue();
        System.out.println(result);

        System.out.println(adder);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3); //모두가 같은 참조값 add는 자신의 참조값 (this)를 리턴하고 있기 때문

    }
}
