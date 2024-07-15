package generic.ex1;

/**
 * generic 의 필요성
 * 다양한 타입을 담는 박스 필요
 */
public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);;
        Integer integer = integerBox.getValue();
        System.out.println(integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello");
        String string = stringBox.getValue();
        System.out.println(string);
    }
}
