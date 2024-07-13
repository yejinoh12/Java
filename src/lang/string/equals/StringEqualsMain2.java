package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("isSame(str1, str2): " + isSame(str1, str2)); //다른 참조값을 가지므로 false

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("(str3 == str4): " + (str3 == str4));
        System.out.println("isSame(str3, str4): " + isSame(str3, str4)); //같은 참조값을 가지므로 true

        str3 = "java";
        System.out.println("(str3 == str4): " + (str3 == str4)); //String은 불변이므로 false

    }

    //매개변수가 new String() 인지 문자열 리터럴인지 확인할 수 있는 방법이 없기 떄문에
    //문자열 비교는 항상 equals 사용(동등성 비교를 보장하기 위해서)
    private static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y);
    }

}
