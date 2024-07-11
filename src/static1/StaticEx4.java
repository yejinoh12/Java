package static1;

//정적 메서드 사용 - 클래스명 생략 가능
import static static1.DecoData.*;

public class StaticEx4 {

    /**
     * 인스턴스 생성 없이 실행하는 가장 대표적인 메서드 main()
     * main() 메서드는 프로그램을 시작하는 시작점
     * 객체를 생성하지 않아도 작동하는 이유는 main()이 static 이기 때문이다.

     * 정적 메서드는 정적 메서드만 호출 가능하기 때문에
     * main()이 호출하는 메서드에는 적정 메서드를 사용한다.
     * 정적 메서드는 같은 클래스 내부에서 정적 메서드만 호출 가능
     */

    public static void main(String[] args) {

        staticCall();
        staticCall();
        staticCall();
        staticCall();
        //DecoData.staticCall();


    }
}
