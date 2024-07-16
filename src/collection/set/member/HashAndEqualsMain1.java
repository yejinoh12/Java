package collection.set.member;

import java.util.HashSet;
import java.util.Set;

/**
 * hashcode와 equals를 오버라이딩 하지 않은 경우

 * hashcode() : object의 기본 기능, 객체의 참조값을 기반으로 해서 해시코드를 생성
 * equals() : object의 기본 기능 , == 비교(참조값 비교)를 함
 *
 * 문제 발생
 *  a,b의 인스턴스(참조값)는 다르지만 둘다 같은 "A"라는 회원 id를 가지므로 논리적으로는 같은 회원으로 보아야 함
 *  하지만 중복 저장이 되고 검색이 되지 않는 문제 발생
 */

public class HashAndEqualsMain1 {

    public static void main(String[] args) {

        Set<MemberNoHashNoEq> set = new HashSet<>(10);

        MemberNoHashNoEq a = new MemberNoHashNoEq("A");
        MemberNoHashNoEq b = new MemberNoHashNoEq("A");

        System.out.println(a.hashCode()); //793589513
        System.out.println(b.hashCode()); //1313922862

        System.out.println(a.equals(b)); // false

        set.add(a);
        set.add(b);

        System.out.println(set);

        //검색에 실패한다.
        MemberNoHashNoEq findValue = new MemberNoHashNoEq("A");
        System.out.println(findValue.hashCode());
        System.out.println(set.contains(findValue)); //false


    }
}
