package modern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// (파라미터 값, ... ) -> { 함수 몸체 }
// (x,y) -> return x+y
// 리턴 값만 있을 경우 {} 생략 가능

public class LambdaAndStreamEx {

    public static void main(String[] args) {

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

        // 주차 대상 차량 추가
        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);


        //티켓이 있는지, 돈이 있는지 검증 후 return 되는 List 추가
        //parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        //parkingLot.addAll(parkingCarWithMoney(carsWantToPark));

        // 매개변수로 메서드를 넘겨줌
        //parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));
        //parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));
        parkingLot.addAll(parkCars(carsWantToPark, (Car car) -> car.hasParkingTicket()));
        parkingLot.addAll(parkCars(carsWantToPark, (Car car) -> car.getParkingMoney() > 1000));
        //parkingLot.addAll(parkCars(carsWantToPark, (Car car) -> car.hasParkingTicket() && car.getParkingMoney() > 1000));

        // 주차된 차량 출력
        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }
    }

    /*
    //티켓 존재 여부 검증
    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (car.hasParkingTicket()) {
                cars.add(car);
            }
        }
        return cars;
    }

    //티켓은 없지만 돈이 1000 초과 있는 차량 검증
    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();


        for (Car car : carsWantToPark) {
            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
                cars.add(car);
            }
        }

        return cars;
    } */

    // 위 두개의 메서드를 하나로 만든다.
    // 내부 주요 로직을 함수(매개변수)로 전달 받는다.
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<Car>();

        for (Car car : carsWantToPark) {
            if(function.test(car)){
                cars.add(car);
            };
        }

        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket(Car car){
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney(Car car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }

    interface Predicate<T> {
        boolean test(T t);
    }

}

