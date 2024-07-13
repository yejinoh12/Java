package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {

        /**
         * parseInt("10") : 기본형 반환
         * valueOf("10") : 래퍼 타입 반환
         */

        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10"); //문자열 전용, 기본형 반환

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult); //내 값이 크면 1, 같으면 0, 내 값이 작으면 -1

        //산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
