package advanced.exercise.ParallelAndConcurrent.Task01;

public class Main {
    public static void main(String[] args) {
        new Thread(new FindEvenNumbers(1000, 2000)).start();
        new Thread(new FindEvenNumbers(14300, 17800)).start();
    }
}