package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(54);
        list.add(20);

        System.out.println("list = " + list);
        System.out.println("list.getClass() = " + list.getClass()); //class java.util.ArrayList

        //일반 리스트를 멀티 스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있음
        //동기화 작업으로 인해 리스트보다 성능은 낮음
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass()); // java.util.Collections$SynchronizedRandomAccessList

    }
}
