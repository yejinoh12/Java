package generic.ex1;

/**
 * 모두의 부모 Object를 이용한 해결 : 타입 안정성 떨어짐
 * - 반환 타입이 맞지 않는 문제 - 직접 다운캐스팅
 * - 잘못된 타입의 인수 전달 문제
 */
public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println(integer);

        ObjectBox StringBox = new ObjectBox();
        StringBox.setValue("hello");
        String string = (String) StringBox.getValue();
        System.out.println(string);

        //잘못된 타입의 인수 전달
        integerBox.setValue("hihi");
        Integer integer2 = (Integer) integerBox.getValue(); //여기서 캐스팅 예외 발생 String -> Integer
        System.out.println(integer2);
    }
}
