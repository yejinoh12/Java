package collection.map.ex;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

        studentMap.put("A", 80);
        System.out.println(studentMap); //같은 키로 저장하면 기존의 값이 변경된다. ;

        //키 조회
        boolean containsKey = studentMap.containsKey("A");
        System.out.println("containsKey = " + containsKey);

        //특정 학생 값 삭제
        studentMap.remove("A");
        System.out.println(studentMap);

    }
}
