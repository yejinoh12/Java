package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2Answer {

    public static void main(String[] args) {

        //Map.of 를 사용해서 생성한 Map은 불변으로 내용을 변경할 수 없다.
        Map<String, Integer> map1 = new HashMap<>(Map.of("A",1, "B", 2, "C", 3));
        //map1.put("A", 1);
        //map1.put("B", 2);
        //map1.put("C", 3);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        //새로운 HashMap 생성
        Map<String, Integer> result = new HashMap<>();

        for(String key : map1.keySet()){
            if(map2.containsKey(key)){
                result.put(key, (map1.get(key) + map2.get(key)));
            }
        }

        System.out.println("result = " + result);

    }
}
