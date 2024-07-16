package collection.map.test;

import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 내가 쓴 답
        // for(int i = 0; i < productArr.length; i ++){
          //  hashMap.put(productArr[i][0], Integer.parseInt(productArr[i][1]));
        //}

        // 정답
        for(String[] product : productArr){
            hashMap.put(product[0], Integer.valueOf(product[1]));
        }

        System.out.println(hashMap);
    }
}
