package collection.list.test.ex1;

import java.util.ArrayList;

public class ListTest1 {

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;
        for (Integer i : students) {
            total += i;
        }

        double average = (double) total / students.size();
        System.out.println(total);
        System.out.println(average);
    }
}
