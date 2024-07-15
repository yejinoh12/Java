package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Dog> dogBox = new Box<>(); //Dog 타입
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println(findDog);

        Box<Cat> catBox = new Box<>(); //Cat 타입
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println(findCat);

        Box<Animal> animalBox = new Box<>(); //Animal 타입
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);
    }
}
