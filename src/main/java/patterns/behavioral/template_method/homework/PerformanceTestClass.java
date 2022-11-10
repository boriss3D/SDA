package patterns.behavioral.template_method.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PerformanceTestClass extends PerformanceTestTemplate {
    List<Long> longValuesList;

    @Override
    public void testIteration() {
        longValuesList = new ArrayList<>(10_000);
        for (int i = 0; i < 10_000; i++) {
            longValuesList.add(new Random().nextLong(Long.MAX_VALUE));
        }
        Collections.sort(longValuesList);
    }

    @Override
    int getWarmupIterationsNum() {
        return 5;
    }

    @Override
    int getIterationsNum() {
        return 100;
    }
}
