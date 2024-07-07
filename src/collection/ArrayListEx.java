package collection;

import java.util.ArrayList;

/*
    collection
    - List interface 중복허용, 저장순서 유지 ArrayList, LinkedList
    - Set interface 중복을 허용하지 않고 저장 순서가 없음, HashSet, TreeSet
    - Map interface : (key, value) 한쌍으로 묶어서 저장, 키는 중복될 수 었고 값은 중복 가능, Hashtable, HashMap, LinkedHashMap, SoredMap, TreeMap 등
 */
public class ArrayListEx {

    public static void main(String[] args) {

        //ArrayList 생성
        ArrayList<Integer> list1  = new ArrayList<> ();

        //ArrayList의 마지막에 객체를 추가, return type boolean(성공하면 true)
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        //지정된 위치(index)에 저장된 객체를 반환
        System.out.println("get(0): " + list1.get(0));

        //수정
        list1.set(0,10);
        System.out.println(list1);

        //삭제
        list1.remove(0);
        System.out.println("get(0): " + list1.get(0));

        //출력
        System.out.println(list1.toString());

        //전체 삭제
        list1.clear();

        System.out.println(list1.toString());
    }
}
