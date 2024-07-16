package collection.set.ex;

import java.util.*;

public class SetEx2 {

    public static void main(String[] args) {

        run(new HashSet<String>()); //순서를 보장하지 않음 데이터를 , 추가하거나 찾는 경우 O(1)
        run(new LinkedHashSet<String>()); //입력한 순서를 보장 (Hash+LinkedList) O(1) - 링크를 연결하므로 HashSet 보다는 오래걸림
        run(new TreeSet<String>()); //데이터 값을 기준으로 정렬 , O(log N)
    }

    public static void run(Set<String> set){
        System.out.println(set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("2");
        set.add("1");

        //System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
