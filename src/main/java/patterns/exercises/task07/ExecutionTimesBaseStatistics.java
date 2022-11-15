package patterns.exercises.task07;

import java.util.List;

public class ExecutionTimesBaseStatistics implements StatisticsLogger {

    private final List<Integer> executionTimes;

    public ExecutionTimesBaseStatistics(List<Integer> executionTimes) {
        this.executionTimes = executionTimes;
    }

    @Override
    public String buildLog() {
        return getBaseStatistics(executionTimes);
    }

    String getBaseStatistics(List<Integer> executionTimes) {
        StringBuilder result = new StringBuilder();

        for (Integer executionTime : executionTimes) {
            result.append(executionTime).append("\n");
        }
        String log = "BaseStatistics:\n";
        return log + result;
    }
}
