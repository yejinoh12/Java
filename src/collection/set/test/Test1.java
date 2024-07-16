package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Integer[] input = {30, 20, 20, 10, 10};

        //Set 구현체의 생성자에 배열은 전달할 수 없지만 List는 전달 가능
        //Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new HashSet<Integer>(List.of(input));

        System.out.println(set);
    }
}
