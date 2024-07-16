package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {

        //Arrays.sort() 이용
        Integer[] array = {3, 9, 10, 33, 80, 2, 5, 3, 2};
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        Arrays.sort(array, new AscComparator());
        System.out.println("Ascomparator() : " + Arrays.toString(array));

        Arrays.sort(array, new DescComparator());
        System.out.println("Descomparator() : " + Arrays.toString(array));

        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator().reversed() : " + Arrays.toString(array));

    }

    static class AscComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            //System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) *-1; //최종 결과에 -1을 곱해서 양수는 음수로, 음수는 양수가 됨
        }
    }

}
