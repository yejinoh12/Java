package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;

public class AnimalHospitalV1 {

    private Animal animal;

    public Animal get() {
        return animal;
    }

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }
    public Animal bigger(Animal targer){
        return animal.getSize() > targer.getSize() ? animal : targer;
    }
}
