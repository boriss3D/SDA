package advanced.lessons.abstraction;

// You can not create a new object from an abstract class Car
public class Main {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("123456789");
        electricCar.runEngine();
        electricCar.openWindow();
        System.out.println(electricCar.getVin());

        GasolineCar gasolineCar = new GasolineCar("13213123");
        gasolineCar.runEngine();
        gasolineCar.openWindow();
        System.out.println(gasolineCar.getVin());

        HatchbackCar hatchbackCar = new HatchbackCar("111111");
        hatchbackCar.runEngine();
        hatchbackCar.openWindow();
        System.out.println(hatchbackCar.getVin());

        //ANONYMOUS class
        Car car = new Car("123") {
            @Override
            void runEngine() {
                System.out.println("engine starts");
            }
        };
        car.runEngine();
        car.openWindow();
        System.out.println(car.getVin());
    }
}
