package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    //개이름과 크기를 출력하고 sound 메서드 호출
    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    //다른 개와 크기를 비교하고 둘 중에 큰 개를 반환
    public Cat bigger(Cat targer){
        return animal.getSize() > targer.getSize() ? animal : targer;
    }

}
