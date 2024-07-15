package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 개 병원과 고양이 병원을 각각 별도의 클래스로 만듦
 * 코드 재사용 x, 타입 안정성 O
 */

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("냐옹이", 40);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제 발생 : 개 병원에 고양이를 전달 -> 다른 타입을 입력하면 컴파일 오류 발생
        //dogHospital.set(cat);

        //개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog: " + biggerDog);
    }
}
