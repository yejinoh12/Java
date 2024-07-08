package algorithm;

import java.util.Arrays;
import java.util.Collections;

//Arrays.sort()
public class SortingEx1 {
    public static void main(String[] args) {

        //기본형 타입
        int[] array = new int[] {90, 2, 55, 12, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Wrapper 클래스
        Integer[] integerArray = new Integer[] {90, 2, 55, 12, 5};
        Arrays.sort(integerArray, Collections.reverseOrder()); // 내림차순
        System.out.println(Arrays.toString(integerArray));
    }
}
