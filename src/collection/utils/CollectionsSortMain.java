package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(70);
        list.add(30);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        Collections.shuffle(list); //무작위로 섞음
        System.out.println("list = " + list);

        Collections.sort(list); //기본정렬 오름차순
        System.out.println("list = " + list);

        Collections.reverse(list); //내림차순
        System.out.println("list = " + list);
    }
}
