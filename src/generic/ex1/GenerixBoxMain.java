package generic.ex1;

/**
 * generic
 * 목적: 코드 재사용성과 타입 안정성 두 마리 토끼를 다 잡을 수 있음
 * 핵심: 사용할 타입을 미리 결정하지 않고 생성 시점에 결정하는 것
 * */

public class GenerixBoxMain {

    public static void main(String[] args) {

        GenerixBox<Integer> integerBox = new GenerixBox<Integer>(); //생성 시점에 T의 타입이 결정
        integerBox.setValue(1000);
        //integerBox.setValue("hello");  //Interger 타입만 허용하므로 컴파일 오류
        System.out.println(integerBox.getValue()); // 객체 생성 시점에 타입이 이미 결정되므로 캐스팅 필요 없음

        //원하는 모든 타입 사용 가능
        GenerixBox<String> stringBox = new GenerixBox<String>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());

        //타입 추론 : 생성하는 제네릭 타입 생략이 가능하다.
        GenerixBox<Integer> integerBox2 = new GenerixBox<Integer>(); //타입 직접 입력
        GenerixBox<Integer> integerBox3 = new GenerixBox<>(); //타입 추론
    }
}
