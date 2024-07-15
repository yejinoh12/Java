package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 10));
        catBox.set(new Cat("냐옹이", 200));

        WildcardEx.printGenericV1(catBox);
        WildcardEx.printWildcardV1(catBox);

        WildcardEx.printGenericV2(catBox);
        WildcardEx.printWildcardV2(catBox);

        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        catBox.set(new Cat("냐~~~~~옹이", 122));
        Cat cat2 = WildcardEx.printAndReturnGeneric(catBox);

        Animal animal = WildcardEx.printAndReturnWildCard(catBox);

    }
}
