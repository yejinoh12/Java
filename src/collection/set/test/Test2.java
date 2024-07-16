package collection.set.test;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        List<Integer> list = List.of(30, 20, 20, 10, 10);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
