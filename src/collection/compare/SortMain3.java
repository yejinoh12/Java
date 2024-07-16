package collection.compare;

import java.util.Arrays;

/**
 * 정렬 Arrays.sort(array, Comparator)
 * - 기본 정렬이 아닌 정렬방식을 지정하고 싶다면 Arrays.sort() 의 인수로 비교자(Comparator)를 만들어서 넘겨주면 됨
 * - 비교자를 따로 전달하면 객체가 기본으로 가지고 있는 Comparable 을 무시하고, 별도로 전달한 비교자를 사용해서 정렬
 */
public class SortMain3 {

    public static void main(String[] args) {

        MyUser u1 = new MyUser("c", 20);
        MyUser u2 = new MyUser("a", 15);
        MyUser u3 = new MyUser("b", 30);

        MyUser[] array = {u1, u2, u3};
        System.out.println("기본 데이터 = " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("오름차순 정렬 = " + Arrays.toString(array));

        //추가
        Arrays.sort(array, new IdComparator());
        System.out.println("ID기준 오름차순 정렬 = " + Arrays.toString(array));
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println("ID기준 내림차순 정렬 = " + Arrays.toString(array));

    }
}
