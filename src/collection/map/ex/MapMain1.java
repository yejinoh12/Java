package collection.map.ex;

import java.util.*;

/**
 * Map
 * Key를 사용해서 해시코드를 생성 (Set 비슷함)
 * Value도 함께 저장해야 하기 때문에 Entry로 <K,V> 형태로 묶어서 저장한다.
 * 해시테이블 : 해시를 사용해서 키와 값을 저장하는 자료 구조
 * 주의 : Map의 Key 로 사용되는 객체는 Hashcode() equals() 를 반드시 구현해야함
 * HashMap 을 많이 사용하고 순서 유지, 정렬의 필요에 따라 다른 것을 선택하면 된다.
 * 참고: Key 값을 찾는 containsKey는 O(1), value값을 찾는 containsValue는 O(n)이 걸린다. 키 값으로 인덱스가 결정 되기 때문, value는 하나하나 뒤져야함
 */

public class MapMain1 {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        //데이터 추가
        studentMap.put("A", 90);
        studentMap.put("B", 50);
        studentMap.put("C", 30);
        studentMap.put("D", 90);
        studentMap.put("E", 100);

        System.out.println(studentMap);

        //특정 학생의 값 조회
        Integer result = studentMap.get("A");
        System.out.println("A의 성적: " + result);
        
        //KeySet: 모든 키 목록 조회, 키 값은 중복을 허용하지 않으므로 중복을 허용하지 않는 자료구조인 Set 으로 반환
        Set<String> keySet = studentMap.keySet();
        for(String key : keySet){
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        //values() : 값 목록 조회, Collection 으로 반환
        //중복을 허용하므로 set 으로 반환 할 수 없음
        //순서를 보장하지 않기 때문에 list 로도 반환 할 수 없음  -> 단순한 값의 모음이므로 Collection 을 반환 한다.
        Collection<Integer> values = studentMap.values();
        for(Integer value : values){
            System.out.println("value = " + value);
        }

        //EntrySet: 키와 값 목록을 한번에 조회, Entry(키-값 쌍으로 이루어진 객체) 사용
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key  + ", values = " + value);
        }


    }
}
