package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 순서가 있는 컬렉션에 정렬이 가능하다
 * 하지만 이 방식 보다는 객체 스스로 정렬 메서드를 가지고 있는 list.sort()의 사용이 더 권장된다.
 */
public class SortMain4 {

    public static void main(String[] args) {

        MyUser u1 = new MyUser("c", 20);
        MyUser u2 = new MyUser("a", 15);
        MyUser u3 = new MyUser("b", 30);

        List<MyUser> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println("기본 데이터 = " + list);

        list.sort(null);
        System.out.println("기본 정렬 = " + list);

        list.sort(new IdComparator());
        System.out.println("IdComparator 정렬 = " + list);

        Collections.sort(list);
        System.out.println(list);
    }
}
