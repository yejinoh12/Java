package collection.iterable;

import java.util.Iterator;

/**
 * Iterable : 반복 가능한, Iterator : 반복자
 * Collection은 Iterable을 구현했기 때문에 Collection 자료구조는 Iterable, Iterator를 사용해서 자료구조 순회가 가능
 * 자료 구조마다 Iterator의 구현제는 다 다르겠지만 우리는 인터페이스만 가져다 쓰면 된다!
 *
 * 향상된 for문
 * Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있음
 *
 * Map은 Iterable 을 구현하지 않았다. keySet(), values() 호출을 통해 Set/Collection 을 반환해서 사용해야한다.
 * 또는 Entry를 Set 구조로 반환하는 entrySet()도 순회가 가능하다.
 */
public class MyArrayMain {

    public static void main(String[] args) {

        MyArray array = new MyArray(new int[]{4,5,6,7,8});

        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()){ //컴파일 시점에 향상된 for문은 이런 형태로 바뀌게 됨
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        for(int value : array){
            System.out.print(value + " ");
        }
    }
}
