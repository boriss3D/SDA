package advanced.exercise.ClassesAndInterfaces.Task03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String make;
    private String type;
    private final Engine engine;

    public Car(String make, String type) {
        this.make = make;
        this.type = type;
        engine = new Engine();
        engine.setEngine(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", engine='" + engine.engineType + '\'' +
                '}';
    }

    static class Engine {
        String engineType;

        void setEngine(Car car) {

            if ("economy".equals(car.getType())) {
                engineType = "diesel";
            } else if ("luxury".equals(car.getType())) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
        }
    }
}
