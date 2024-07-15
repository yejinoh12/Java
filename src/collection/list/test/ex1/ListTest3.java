package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                list.add(input);
            }
        }

        int total = 0;
        for (Integer i : list) {
            total += i;
        }

        double average = (double) total / list.size();
        System.out.println(total);
        System.out.println(average);

        sc.close();
    }
}
