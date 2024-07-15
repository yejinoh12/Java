package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 재사용성과 타입안정성 보장
 * Animal의 기능 사용 가능
 */
public class AnimalHospitalMainV3 {

    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
        //AnimalHospitalV3<String> str = new AnimalHospitalV3<String>(); 컴파일 오류, 지정되지 않은 타입

        Dog dog = new Dog("멍멍이", 30);
        Cat cat = new Cat("냐옹이", 50);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //dogHospital.set(cat); //다른 타입을 입력하면 컴파일 오류가 발생 -> 타입 안정성 문제 해결

        //문제2: Animal 타입을 반환하기 때문에 다운 캐스팅이 필요
        //실수로 고양이를 입력했는데 강아지를 반환하면 캐스팅 예외 발생
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog: " + biggerDog);

    }
}
