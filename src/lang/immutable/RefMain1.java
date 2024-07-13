package lang.immutable;

public class RefMain1 {

    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법은 없음.
        System.out.println("immutableAddress1 = " + a);
        System.out.println("immutableAddress2 = " + b);

        //b.setValue("부산"); 컴파일 오류, 불변 객체이므로 변경 불가능
        b = new ImmutableAddress("Busan"); //새롭게 생성해야함
        System.out.println("immutableAddress1 = " + a);
        System.out.println("immutableAddress2 = " + b);


    }
}
