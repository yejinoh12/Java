package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {

        Dog d = new Dog("멍멍", 10);
        Cat c = new Cat("냐용", 20);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(d);

        Cat returnCat = hospital.printAndReturn(c);
        System.out.println((returnCat));


    }
}
