package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result); //새로운 객체를 생성하고 참조값을 리턴 , 불변을 유지하며 새로운 값도 만들어 냄
    }

    public int getValue() {
        return value;
    }
}
