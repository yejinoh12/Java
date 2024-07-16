package collection.map.test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        //공통 키를 찾음
        Set<String> intersection = map1.keySet();
        intersection.retainAll(map2.keySet());
        System.out.println(intersection);

        //새로운 HashMap 생성
        Map<String, Integer> result = new HashMap<>();

        Iterator<String> iterator = intersection.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            int value = map1.get(str) + map2.get(str);
            result.put(str, value);
        }

        System.out.println("result = " + result);
    }
}
