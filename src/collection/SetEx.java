package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        // Set : 순서가 없고 중복이 없음
        // HashSet, TreeSet 등으로 응용해서 사용가능
        // Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음. -> 생성자가 존재하는 HashSet을 이용해서 구현

        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);

        for(Integer i : set){
            System.out.println(i + " ");
        }

        // 집합이 있는 요소가 있는지
        System.out.println(set.contains(5));
        System.out.println(set.contains(50));

        //또한 삽입 시 순서가 없기 때문에 배열(Array)이나 List 처럼 .get(인덱스)로 값을 가져올 수 없다
        //출력시 순서가 보장되지 않는다.
        //순서대로 출력하기 위해서 Iterator 사용
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }


    }
}
