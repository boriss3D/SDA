package advanced.lessons.abstraction;

public abstract class Car {

    private final String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    abstract void runEngine();

    void openWindow() {
        System.out.println("windows are opened!");
    }
}
