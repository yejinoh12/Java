package collection.iterable;

import java.util.Iterator;

//Iterable 을 구현하고, Iterator를 구현한 MyArrayIterator 를 반환하는 간단한 자료구조
public class MyArray implements Iterable<Integer>{

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
