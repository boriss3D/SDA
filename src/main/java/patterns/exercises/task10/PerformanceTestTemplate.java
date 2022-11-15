package patterns.exercises.task10;

import java.time.LocalDateTime;

public abstract class PerformanceTestTemplate {
    abstract void testIteration();

    abstract int getWarmupIterationsNum();

    abstract int getIterationsNum();

    final void run() {
        for (int i = 0; i < getWarmupIterationsNum(); i++) {
            testIteration();
        }

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < getIterationsNum(); i++) {
            testIteration();
        }
        LocalDateTime end = LocalDateTime.now();

        System.out.println("Single iteration duration in nanos -> "
                + ((end.getNano() - start.getNano())) / getIterationsNum());
    }
}
