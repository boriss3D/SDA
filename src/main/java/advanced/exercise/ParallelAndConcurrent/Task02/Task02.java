package advanced.exercise.ParallelAndConcurrent.Task02;

public class Task02 {
    public static void main(String[] args) {
        Car car01 = new Car("Honda", "Sport Car");
        Car car02 = new Car("Audi", "Limousine");

        Bridge bridge = new Bridge();

        new Thread(() -> bridge.driveThrough(car01)).start();
        new Thread(() -> bridge.driveThrough(car02)).start();
    }
}
