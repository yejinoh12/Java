package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 다형성 시도
 * 코드 재사용 O, 타입 안정성 X
 */

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("냐옹이", 40);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이를 전달해도 컴파일 오류가 발생하지 않음(매개변수 체크 실패)
        //Animal은  Cat을 받을 수 있기 때문
        //dogHospital.set(cat);

        //문제2: Animal 타입을 반환하기 때문에 다운 캐스팅이 필요
        //실수로 고양이를 입력했는데 강아지를 반환하면 캐스팅 예외 발생
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog: " + biggerDog);

    }
}
