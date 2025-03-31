

// Car.java
public class Car extends Vehicle {
    private String engineType;
    
    public Car(String model, int year, String engineType) {
        super(model, year);
        this.engineType = engineType;
    }
    
    public String getEngineType() {
        return engineType;
    }
}

