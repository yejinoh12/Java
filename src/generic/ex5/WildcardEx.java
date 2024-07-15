package generic.ex5;

import generic.animal.Animal;

/**
 * 와일드 카드는 제네릭 타입이나 제네릭 메서드를 선언하는 것이 아님, 이미 만들어진 제네릭 타입을 활용할 때 사용

 * 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니면 더 단순한 와일드 카드 사용을 권장
 * 메서드의 타입을 특정 시점에 변경하려면 제네릭 타입이나 제너릭 메서드 사용 권장
 */

public class
WildcardEx {

    //제네릭 메서드
    //Box<Dog> dogBox를 전달, 타입 추론에 의해서 타입 T가 결정 되는 것
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //제네릭 메서드가 아닌 일반적인 메서드
    // 와일드 카드 ? 는 모든 타입을 받을 수 있다.
    // ? - Box<Dog>, Box<Cat>, Box,Object> 가 들어 올 수 있음 -> 제한 없이 모든 타입을 다 받을 수 있는 와일드 카드를 비제한 와일드 카드라고 한다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("name: " + t.getName());
    }

    //와일드 카드의 상한 제한
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("name: " + animal.getName());
    }

    //반환 타입을 바꿀 수 있음(Box<Dog>가 들어오면 Dog return)
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("name: " + t.getName());
        return t;
    }

    //와일드 카드의 한계 : 반환 타입을 바꿀 수 없음, 애니멀 반환
    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("name: " + animal.getName());
        return animal;
    }

}