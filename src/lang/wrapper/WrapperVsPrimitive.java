package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {

        int iterations = 1_000_000_000; //반복회수
        long start, end;

        //기본 자료형 long 사용
        long sumPrimitive = 0;
        start = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        end = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println("기본 자료형 long 실행시간: " + (end-start) + "ms"); //기본 자료형 long 실행시간: 3ms

        //래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        start = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumWrapper += i; //오토 박싱 발생
        }
        end = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println("래퍼 클래스 Long 실행시간: " + (end-start) + "ms"); //래퍼 자료형 Long 실행시간: 3899ms , 더 많은 메모리 사용


    }
}
