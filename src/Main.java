// 메서드 오버라이딩 예제

public class Main {
    public static void main(String[] args){
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();

        /*Vehicle bike2 = new Bike(); // 상위 클래스 타입으로 선언 + 각각 타입으로 객체 생성
        Vehicle car2 = new Car();
        Vehicle motorBike2 = new MotorBike();

        // Vehicle 타입으로 선언했지만 출력은 각각의 타입으로 선언했을때와 동일
        bike2.run();
        car2.run();
        motorBike2.run();*/

        Vehicle[] vehicles = new Vehicle[] { new Bike(), new Car(), new MotorBike()};
        for (Vehicle vehicle : vehicles) { // vehicles 배열요소를 차례대로 vehicle에 넣는다
            vehicle.run(); // 위와 같은 결과를 출력!
        }
    }
}
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle {
    void run() {
        System.out.println("MotorBike is running");
    }
}