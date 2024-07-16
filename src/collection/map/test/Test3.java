package collection.map.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Test3 {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";
        HashMap<String, Integer> hashMap = new HashMap<>();


        String[] split = text.split(" ");

        for (String str : split) {

            /*if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);

            } else {
                hashMap.put(str, 1);
            }*/
            hashMap.put(str, hashMap.getOrDefault(str, 0)+1);
        }

        System.out.println("hashMap = " + hashMap);
    }

}
