package generic;

//generic : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다.
//T(Type Variable) 들어가야할 타입을 명시
public class GenericEx1<T>{

    private T t;

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericEx1<String> gen1 = new GenericEx1<String>();
        gen1.setT("Hello");
        System.out.println(gen1.getT());

        GenericEx1<Integer> gen2 = new GenericEx1<Integer>();
        gen2.setT(123);
        System.out.println(gen2.getT());
    }
}
