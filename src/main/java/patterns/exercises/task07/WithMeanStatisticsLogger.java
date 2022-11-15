package patterns.exercises.task07;

public class WithMeanStatisticsLogger implements StatisticsLogger {

    private final StatisticsLogger statisticsLogger;

    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public String buildLog() {
        return getMeanStatistic(statisticsLogger) + statisticsLogger.buildLog();
    }

    String getMeanStatistic(StatisticsLogger statisticsLogger) {
        String[] dataString = statisticsLogger.buildLog().split("BaseStatistics:\n");
        String[] integers = dataString[1].split("\n");

        int sum = 0;
        for (String s: integers) {
            sum += Integer.parseInt(s);
        }
        String log = "Mean:\n";
        return log + sum / integers.length + "\n";
    }
}
