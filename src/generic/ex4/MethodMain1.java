package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {

        Integer i = 10;
        // 다운 캐스팅 발생
        Integer i2 = (Integer) GenericMethod.objMethod(i);

        //타입 인지 명시적 전달
        //타입 추론 가능 : 타입을 추론해서 컴파일러가 대신 처리하기 때문에 타입을 전달하지 않는 것처럼 보이지만
        //실제로는 타입인자가 전달 되고 있음
        Integer i3 = GenericMethod.<Integer>genericMethod(10);
        Integer i4 = GenericMethod.<Integer>numberMethod(30);
        Double i5 = GenericMethod.numberMethod(20.0);
    }
}
