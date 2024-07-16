package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test3 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union : " + union);

        //교집합
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //지정된 컬렉션에 포함된 요소만을 유지하고 나머지 요소는 세트에서 제거한다.
        System.out.println("intersection : "  + intersection);

        //차집합
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference : " + difference);
    }
}
