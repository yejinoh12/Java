package final1;

public class FieldInit {


    static final int CONS_VALUE = 10; //상수
    final int value = 10; // 초기값을 넣은 경우에는 생성자에서 못바꿈

    /**
     * final 필드 초기화
     * 모든 인스턴스가 같은 값을 가진 채로 메모리에 할당되므로
     * 메모리 중복/낭비가 된다.
     * 이 경우 static 키워드로 공용 변수로 바꾸면
     * 초기값이 유지한 채로 메모리 중복을 해결할 수 있다.
     *
     * final을 필드 초기화 하는 경우 static을 같이 붙이는 것이 효과적
     */
}
