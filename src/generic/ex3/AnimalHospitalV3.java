package generic.ex3;

import generic.animal.Animal;

/** 타입 매개변수의 제한 -> 자바 컴파일러는 T에 입력될 수 있는 값의 범위를 예측할 수 있다.
 *  T의 상한을 Animal로 설정하여 Animal과 Animal의 자식만 들어올 수 있도록한다.
 * 최소 Animal 의 기능을 사용이 가능하게 된다.
 */

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T targer){
        return animal.getSize() > targer.getSize() ? animal : targer;
    }
}
