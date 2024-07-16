package collection.set.member;

import java.util.HashSet;
import java.util.Set;

/**
 * hashcode만 오버라이딩한 경우
 *
 * 문제 발생
 *  id를 기준으로 같은 hashcode를 가지도록 오버라이딩 했으므로 같은 hashcode를 가지게 되었지만
 *  해시 인덱스에 데이터가 중복으로 저장된다. -> 중복값을 허용하지 않으므로 저장되면 안됨
 *
 *  이유
 *  add 로직은 중복 데이터를 체크하기 위해 equals 를 사용함
 *  equals 는 객체의 참조 값을 비교하기 때문에 서로 다른 인스턴스인 a,b 는 비교에 실패하게됨
 */

public class HashAndEqualsMain2 {

    public static void main(String[] args) {

        Set<MemberOnlyHash> set = new HashSet<>(10);

        MemberOnlyHash a = new MemberOnlyHash("A");
        MemberOnlyHash b = new MemberOnlyHash("A");

        System.out.println("a.hashCode(): " + a.hashCode()); //65
        System.out.println("b.hashCode(): " + b.hashCode()); //65
        System.out.println("a.equals(b): " + a.equals(b)); // false

        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a)); //원래 참조값
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b)); //add() 로직은 이 참조값을 바탕으로 equals 비교를 하므로 중복 데이터가 없다고 판단해서 모두 저장하게됨

        set.add(a);
        set.add(b);

        System.out.println(set);

        //검색에 실패한다.
        //해시 인덱스는 찾을 수 있지만, 해시 인덱스에 있는 데이터의 비교는 equals 를 사용하므로 검색에 실패
        MemberOnlyHash findValue = new MemberOnlyHash("A"); //65
        System.out.println(findValue.hashCode());
        System.out.println(set.contains(findValue)); //false


    }
}
