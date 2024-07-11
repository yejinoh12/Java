package final1;

public class Constant {

    /**
     * 상수란 static final
     * 변하지 않고 항상 일정한 값을 갖는 수
     * 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값
     * 대문자 사용, 언더스코어 _ 사용
     * 기능 보다는 고정된 값 자체를 사용하는 것이 목적(ex - 파이)
     * 필드에 직접 접근하여 사용하고 final 이기 때문에 변경 불가능
     * 애플리 케이션 전반에서 사용되어 주로 public 사용
     */

    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;

}
 