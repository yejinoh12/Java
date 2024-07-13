package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue){
        value += addValue;
        return this; //자신의 참조값 반환
    }

    public int getValue() {
        return value;
    }
}
