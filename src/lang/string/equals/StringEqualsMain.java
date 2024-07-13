package lang.string.equals;

public class StringEqualsMain {

    public static void main(String[] args) {

        //스트링 클래스 생성
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2)); //주소값은 다르므로 false
        System.out.println("str1.equals(str2): " + (str1.equals(str2))); //String 틀래스에 equals()가 오버라이딩 되어있어 문자열 일치 비교 가능 true

        //문자열 리터럴
        String str3 = "Hello";
        String str4 = "Hello";

        /** 문자열 풀
         * 자바는 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어 둠
         * 같은 문자열이 있으면 만들지 않고 같은 문자열을 가진 인스턴스를 찾아 참조를 반환
         * 메모리 사용량을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능 최적화
         */

        System.out.println("str3 == str4: " + (str3 == str4)); //같은 참조값을 가지므로 true
        System.out.println("str4.equals(str4): " + (str3.equals(str4)));  //true

        str3 = "world";
        System.out.println(str3);
        System.out.println(str4);


    }
}
