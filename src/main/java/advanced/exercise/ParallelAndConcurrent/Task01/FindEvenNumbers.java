package advanced.exercise.ParallelAndConcurrent.Task01;

public class FindEvenNumbers implements Runnable {
    private final int start;
    private final int stop;

    public FindEvenNumbers(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
