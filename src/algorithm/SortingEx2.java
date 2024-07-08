package algorithm;

import java.util.ArrayList;
import java.util.Collections;

//Collections
public class SortingEx2 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(90);
        array.add(2);
        array.add(55);
        array.add(12);
        array.add(5);

        Collections.sort(array); //오름차순
        System.out.println(array.toString());

        Collections.sort(array, Collections.reverseOrder()); //내림차순
        System.out.println(array.toString());
    }
}
