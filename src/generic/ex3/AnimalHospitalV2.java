package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2 <T> {

    private T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){

        /**
         * 메서드를 정의하는 시점에는 T의 타입을 알수 없음.
         * 제네릭 타입을 선언하면 자바 컴파일러 입장에서 T에 어떤 값이 들어올 지 예측할 수 없음
         * Animal 타입의 자식이 들어오길 기대했지만, 코드 어디에도 Animal에 대한 정보가 없기 때문에
         * 컴파일 오류가 발생함
         *
         * 문제 1 : Object의 기능만 사용 가능
         * 어떤 타입이 들어올 지 모르기 때문에 T를 어떤 타입이든 받을 수 있는 모든 객체의 부모인 Object 타입으로 가정
         * 따라서 Object가 제공하는 메서드만 호출할 수 있음
         *
         * 문제 2 : 원하지 않은 Type이 들어올 가능성
         * 동물 병원에 Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달 할 수 있음
         * 최소한 Animal 이나 그 자식 타입 인자로 제한
         */

        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();

        animal.toString();
        animal.equals(null);
    }
    public Animal bigger(T targer){
        //return animal.getSize() > targer.getSize() ? animal : targer;
        return null;
    }
}
