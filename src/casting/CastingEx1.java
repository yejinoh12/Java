package casting;

public class CastingEx1 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        intValue = (int) doubleValue; //(int)생략시 컴파일 에러
        System.out.println(intValue); //출력: 1
    }
}
