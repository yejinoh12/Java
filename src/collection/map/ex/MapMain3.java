package collection.map.ex;

import java.util.HashMap;

public class MapMain3 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 데이터 추가
        studentMap.put("A", 50);
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가 1
        if(!studentMap.containsKey("A")){
            studentMap.put("A", 100);
        }
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가 2 - putIfAbsent() 사용
        studentMap.putIfAbsent("A", 100); //A가 이미 있으므로 들어가지 않음
        studentMap.putIfAbsent("B", 100); //B가 없으므로 추가 됨

        System.out.println("studentMap = " + studentMap);

    }
}
