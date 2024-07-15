package generic.ex4;

// 클래스 전체가 아닌 특정 메서드 단위로 제네릭을 도입 할 때 사용

// 참고: 제네릭 타입은 static 메서드에 타입 매개변수를 사용 할 수 없음
// 이유: 제네릭 타입은 객체를 생성하는 시점에 타입이 결정되는데, static 매서드는 인스턴스 단위가 아닌
// 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    //제네릭 메서드 정의 메서드 반환 타입 왼쪽에 <T> 와 같이 타입 매개 변수를 적어줌
    //실제 호출되는 시점에 다이아몬드를 사용해서 <Integer>와 같이 타입을 정하고 호출

    //즉 메서드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것
    //타입을 지정한 뒤 메서드를 호출한다.
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }

    //제네릭 메서드도 타입 제한 가능
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Bound print: " + t);
        return t;
    }

}
