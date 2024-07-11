package reference;

public class RefEx1 {

    // 기본형 메서드 호출
    //대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다. 매우 중요
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); //값이 바뀌지 않는다. a=10
    }
    static void changePrimitive(int x) {
        x = 20;
    }
}
