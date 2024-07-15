package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog d = new Dog("멍멍이", 20);
        Cat c = new Cat("냐용이", 50);

        AnimalMethod.checkup(d);
        AnimalMethod.checkup(c);

        Dog d2 = new Dog("뭉뭉이", 60);
        Dog bigger = AnimalMethod.bigger(d, d2);
        //Dog bigger = AnimalMethod.bigger(d, c); dog만 받을 수 있음 컴파일 에러
        System.out.println(bigger);

    }
}
