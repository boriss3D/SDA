package advanced.exercise.parallelandconcurrent.task01;

public class Task01 {
    public static void main(String[] args) {
        new Thread(new FindEvenNumbers(1000, 2000)).start();
        new Thread(new FindEvenNumbers(14300, 17800)).start();
    }
}