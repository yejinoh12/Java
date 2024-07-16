package collection.map.ex;

import java.util.*;

public class MapMain4 {

    public static void main(String[] args) {

        run(new HashMap<String, Integer>()); //순서가 보장이 안됨
        run(new LinkedHashMap<String, Integer>()); //입력한 순서가 보장이 됨
        run(new TreeMap<String, Integer>()); //키 자체의 값을 기준으로 정렬됨
    }

    public static void run(Map<String, Integer> map){
        System.out.println(map.getClass().getName());

        map.put("C", 10);
        map.put("A", 90);
        map.put("1", 20);
        map.put("2", 40);
        map.put("D", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key = " + key + ", value = " + map.get(key));
        }
    }
}
