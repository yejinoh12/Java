package generic.test.test4;

import generic.test.test3.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T t;

    public void in(T t) {
        this.t = t;
    }

    public T out() {
        return this.t;
    }

    public void showInfo() {
        System.out.println("이름: " + t.getName() +
                ", HP: " + t.getHp());
    }
}
