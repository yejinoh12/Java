package lang.object.equals;

public class EqualsMain1 {

    public static void main(String[] args) {

        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        //Object가 제공하는 equals 는 == 으로 참조값이 동일한지 비교
        //동등성 비교를 사용하고 싶다면 equals()를 재정의
        System.out.println(userV1.equals(userV2));

    }
}
