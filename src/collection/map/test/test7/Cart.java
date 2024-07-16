package collection.map.test.test7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, Integer addQuantity) {
        cartMap.put(product, (cartMap.getOrDefault(product, 0) + addQuantity));
    }

    public void minus(Product product, Integer minusQuantity) {

        int nowQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = nowQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry: entries) {
            System.out.println(entry.getKey() + " 수량: " + entry.getValue());
        }

    }
}
