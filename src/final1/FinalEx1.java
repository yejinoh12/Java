package final1;

public class FinalEx1 {

    public static void main(String[] args) {

        //final 지역 변수 1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        // data1 = 20; 컴파일 에러 java: variable data1 might already have been assigned

        //final 지역 변수 2
        final int data2 = 10;
        // data2 = 20; 컴파일 에러
    }

    static void method(final int data) {
        // data = 20; 컴파일 오류
    }
}