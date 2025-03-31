// Car.java
// This class will cause a compilation error
public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting");
    }
}