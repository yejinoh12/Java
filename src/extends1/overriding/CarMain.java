package extends1.overriding;

/**
 * 메서드 오버라이딩(Overriding)
 * 부모에게서 상속 받을 기능을 자식이 재정의 하는 것
 * 이름과 매개변수, 반환타입이 동일 해야함
 * static, final, private 키워드가 붙은 메서드는 오버라이딩 할 수 없다.
 * 생성자는 오버라이딩 할 수 없음
 */
public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }

}
