package lang.immutable;

//불변객체 : 변수를 final로 선언하고 setValue를 삭제 ->
// 생성자를 통해서만 값을 설정할 수 있고, 이후에는 값을 변경하는 것이 불가능

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

}
