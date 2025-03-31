// VehicleTest.java (for Q2)
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2023, "V6");
        
        System.out.println("Car Details:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Engine Type: " + car.getEngineType());
    }
}