package reference;

import javax.xml.crypto.Data;

public class NullEx1 {

    public static void main(String[] args) {
        Data2 data = null;
        System.out.println("1: " + data);

        data = new Data2();
        System.out.println("2: " + data);
        System.out.println(data.value); //int = 0 으로 자동 초기화

        data = null;
        System.out.println("3: " + data); // 참조가 끊어짐
        // 아무도 참조하지 않게 디었고 해당 인스턴스에 다시 접근 할 방법이 없다.
        // 아무도 참조하지 않는 인스턴스는 JVM의 가비지컬렉션이 자동으로 메모리에서 저거-자바의 장법


    }
}
