package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {

        ///불변 리스트 생성
        List<Integer> list = List.of(1, 2, 4);

        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(10);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        //다시 불변 리스트로
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection(mutableList);
        System.out.println("unmodifiableList = " + unmodifiableList);
    }
}
