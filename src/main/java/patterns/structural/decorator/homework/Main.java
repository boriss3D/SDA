package patterns.structural.decorator.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StatisticsLogger executionTimesBaseStatistics =
                new ExecutionTimesBaseStatistics(List.of(10, 15, 14, 18, 9));

        executionTimesBaseStatistics = new WithMeanStatisticsLogger(executionTimesBaseStatistics);
        executionTimesBaseStatistics = new WithSummaryStatisticsLogger(executionTimesBaseStatistics);

        System.out.println(executionTimesBaseStatistics.buildLog());
    }
}
