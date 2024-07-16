package collection.list;

import java.util.LinkedList;

/*
    링크드리스트
    - 메모리에 는 공간을 요청해서 여기저기 나누어서 실제값을 담아둠
    - 실제값에 대한 주소값으로 목록을 구성하고 저장
    - 데이터가 불연속적으로 존재하므로 조회 속도는 느리지만
    - 값 추가와 삭제는 빠르다
 */
public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(0); //순차적 추가/삭제는 ArrayList가 더 빠르다.
        linkedList.add(1);
        linkedList.add(2);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); //조회 시 속도가 ArrayList 보다 느림

        linkedList.add(1, 200); //중간 데이터 추가/삭제는 LinkedList가 더 빠르다.
        System.out.println(linkedList.toString());

        linkedList.set(1, 300);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());

    }

}
