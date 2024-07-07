package modern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {
        // Stream : 자료구조(Map, Set, List)의 흐름
        // 원본의 데이터를 변경하지 않음: 자바 컬렉션으로부터 스트림을 받아서 한번 사용 -> 일회성
        // 모든 컬렉션을 상속하는 구현체들은 스트림을 반환 할 수 있음
        // stream api : forEach, filter, map 등

        //주차 대상 차량
        ArrayList<Car> carsWantToPark = new ArrayList<>();

        // 주차장
        ArrayList<Car> parkingLot = new ArrayList<>();

        // 5개의 Car Instance
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        for(Car car : carsWantToPark) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


        //filter()
        System.out.println("filter()");
        List<Car> kiaCar = carsWantToPark.stream(). //carWantToPark의 스트림 값을 받아서
                filter((Car car) -> car.getCompany().equals("BMW")). //filter 메서드는 함수를 파라미터로 전달 받아 제조사가 일치하면 true 반환, ,false이면 스트림 원소 제거
                toList(); // 반환 결과를 다시 리스트로 묶어줌

        for(Car c : kiaCar) {
            System.out.println("Parked Car : " + c.getCompany() + "-" + c.getModel());
        }


        //forEach() : 각각의 원소에 넘겨받은 함수를 실행
        System.out.println("forEach()");
        List<String> carNames = Arrays.asList("A9", "Class E", "Morning");
        carNames.stream().forEach(System.out::println);


        //map()
        System.out.println("map()");

        carNames.stream().map(a->a.toUpperCase()).forEach(System.out::println);

        carsWantToPark.stream().
                filter((Car car) -> car.getCompany().equals("BMW")).  //회사가 bmw 인 것만 골라서
                map(car -> car.getModel()).                           // 모델명 반환
                forEach(System.out::println);


    }
}
