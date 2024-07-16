package collection.set.member;

import java.util.HashSet;
import java.util.Set;

/**
 * Hashcode, equals 모두 오버라이딩 : 중복저장이 되지 않고 검색에도 성공한다.
 */

public class HashAndEqualsMain3 {

    public static void main(String[] args) {

        Set<Member> set = new HashSet<>(10);

        Member a = new Member("A");
        Member b = new Member("A");

        System.out.println("a.hashCode(): " + a.hashCode());
        System.out.println("b.hashCode(): " + b.hashCode());
        System.out.println("a.equals(b): " + a.equals(b)); //true

        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a)); //원래 참조값
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));

        set.add(a);
        set.add(b);

        System.out.println(set);

        //검색 성공
        Member findValue = new Member("A"); //65
        System.out.println(findValue.hashCode());
        System.out.println(set.contains(findValue)); //false


    }
}
