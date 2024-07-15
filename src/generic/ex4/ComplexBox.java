package generic.ex4;

import generic.animal.Animal;

/**
 * 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가짐
 * 가깝고 구체적인 것에 걸림
 */

public class ComplexBox <T extends Animal>{ // 1. 제네릭 타입 선언

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    // 2.제네릭 메서드 선언
    public <Z> Z printAndReturn(Z z){
        System.out.println("animal.className: " + animal.getClass().getName()); // T의 상환이 없으므로 Object로 취급, t.getName() 불가
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }
}