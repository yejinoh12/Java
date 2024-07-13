package lang.object.equals;

public class EqualsMain2 {

    public static void main(String[] args) {

        UserV2 userV1 = new UserV2("id-100");
        UserV2 userV2 = new UserV2("id-100");

        //System.out.println(userV1 == userV2); //동일성 비교(identity) - 객체의 참조가 다르므로 false
        System.out.println(userV1.equals(userV2)); //동등성 비교(euality) - 서로 다른 객체지만 고유 id 를 가지므로 true
    }
}
