package static1;

/**
 * static 메서드는 static 만 사용할 수 있다.
 * - 클래스 내부 기능 사용시 정적 메서드는 static이 붙은 정적 변수만 사용 가능
 * - 클래스 내부 기능을 사용할 때 정적 메서드는 인스턴스 변서/메서드 사용 불가
 * 모든 곳에서 static 호출 가능 (접근 제어가 가능하다면)
 */
public class DecoData {

    private int instanceValue; //인스턴스 변수
    private static int staticValue; //정적 변수

    public static void staticCall() {
        staticValue++;
        staticMethod();
        //instanceValue++; 인스턴스 변수 접근 불가 compile error
        //instanceMethod(); 인스턴스 메서드 접근 불가 compile error
        //static은 클래스 소속인데 인스턴스 변수는 객체가 생성되야
        //그 때서야 힙 영역에 생성되므로, static 메서드에 접근 할 수 없다.
    }

    //인스턴스 메서드에서는 모두 가능
    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }


    private void instanceMethod() {
        System.out.println("intanceValue: " + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }

    //외부에서 참조값이 넘어오면 호출이 가능하다
    public static void staticCall(DecoData decoData){
        decoData.instanceValue++;
        decoData.instanceMethod();;
    }


}
