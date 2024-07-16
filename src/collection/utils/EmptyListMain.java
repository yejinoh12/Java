package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {


        //빈 가변 리스트 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바4
        List<Integer> list4 = List.of(); //자바9

        //list3.add(4); 에러

        System.out.println("list3.getClass() = " + list3.getClass()); //java.util.Collections$EmptyList
        System.out.println("list4.getClass() = " + list4.getClass()); //java.util.ImmutableCollections$ListN


    }
}
