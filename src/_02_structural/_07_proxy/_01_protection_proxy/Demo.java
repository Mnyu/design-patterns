package _02_structural._07_proxy._01_protection_proxy;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(new Driver(12));
        Car car1 = new CarProxy(new Driver(12));
        car.drive();
        car1.drive();
    }
}
