package lang.immutable;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        Member memberA = new Member("회원A", address);
        Member memberB = new Member("회원B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산"); //컴파일 오류

        memberB.setAddress(new ImmutableAddress("부산")); //새로운 주소 객체를 생성해서 전달

        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }


}
