package _02_structural._07_proxy._01_protection_proxy;

public class CarProxy extends Car {

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.getAge() >= 16) {
            super.drive();
        } else {
            System.out.println("Driver too young!");
        }
    }
}
