package patterns.exercises.task07;

import java.util.Arrays;

public class WithSummaryStatisticsLogger implements StatisticsLogger {

    private final StatisticsLogger statisticsLogger;

    public WithSummaryStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public String buildLog() {
        return  getSummaryStatistic(statisticsLogger) + statisticsLogger.buildLog();
    }

    String getSummaryStatistic(StatisticsLogger statisticsLogger) {
        String[] dataString = statisticsLogger.buildLog().split("BaseStatistics:\n");
        String[] stringNumbers = dataString[1].split("\n");
        int[] integers = new int[stringNumbers.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(stringNumbers[i]);
        }
        Arrays.sort(integers);

        String log = "Summary Statistic:\n";
        log += "number of records -> " + integers.length + "\n";
        log += "sum -> " + Arrays.stream(integers).sum() + "\n";
        log += "minimum value -> " + integers[0] + "\n";
        log += "maximum value -> " + integers[integers.length - 1] + "\n";

        return log;
    }
}
