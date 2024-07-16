package collection.compare;

import java.util.Arrays;
import java.util.List;

public class SortMain {

    public static void main(String[] args) {

        //Arrays.sort() 이용
        Integer[] array = {3,4,5,3,2,5,3,2};
        System.out.println("before sorting: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("after sorting: " + Arrays.toString(array));

    }
}
