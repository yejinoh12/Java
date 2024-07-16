package collection.compare;

import java.util.List;
import java.util.TreeSet;

/**
 * TreeSet을 생성할 때 별도의 비교자를 제공하지 않으면 객체가 구현한 Comparable을 사용한다.
 * 비교자를 제공하면 Comparable 대신 Comparator를 사용해서 정렬한다
 * 둘다 구현 되지 않으면 런타임 오류가 발생한다.
 */
public class SortMain5 {

    public static void main(String[] args) {

        MyUser u1 = new MyUser("k", 20);
        MyUser u2 = new MyUser("a", 15);
        MyUser u3 = new MyUser("b", 30);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(u1);
        treeSet1.add(u2);
        treeSet1.add(u3);
        System.out.println("treeSet1 = " + treeSet1); //트리에 넣을 때부터 정렬이 됨

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator()); //생성할 때 정렬 기준을 넣을 수 있음
        treeSet2.add(u1);
        treeSet2.add(u2);
        treeSet2.add(u3);
        System.out.println("treeSet2 = " + treeSet2);
    }
}
