package advanced.exercise.parallelandconcurrent.task02;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println(car.getName() + " on a bridge.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bridge is free\n");
    }
}
