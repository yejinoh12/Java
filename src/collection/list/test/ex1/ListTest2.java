package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest2 {

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

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }

        sc.close();
    }

}
