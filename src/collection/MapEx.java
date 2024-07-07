package collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

        // Map : Key- Value, Key는 Unique하게 보장이 되야함

        Map<String, Integer> map = new HashMap<>();

        // 추가
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("a", 15); //중복

        // keySet 키만 빼서 배열로 만듦
        System.out.println("---key---");
        for(String key: map.keySet()){
            System.out.println(key);
        }
        // Value 값을 배열로 만들어 출력
        System.out.println("---value---");
        for(Integer key: map.values()){
            System.out.println(key);  //중복된 키값이 있을 경우, 마지막 저장된 값으로 덮어쓰여짐
        }

        //key값으로 조회
        Integer v = map.get("a");
        System.out.println("Value for key 'a': " + v);

        //System.out.println(map.get("a"));
    }
}
