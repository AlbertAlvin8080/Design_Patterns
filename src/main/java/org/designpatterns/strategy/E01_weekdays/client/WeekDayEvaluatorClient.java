package org.designpatterns.strategy.E01_weekdays.client;

import org.designpatterns.strategy.E01_weekdays.contract.WeekDayStrategy;

public class WeekDayEvaluatorClient {
    private WeekDayStrategy weekDayStrategy;

    public WeekDayEvaluatorClient(WeekDayStrategy weekDayStrategy) {
        this.weekDayStrategy = weekDayStrategy;
    }

    public void evaluateWeekDay() {
        weekDayStrategy.evaluateWeekDay();
    }

    public WeekDayStrategy getWeekDayStrategy() {
        return weekDayStrategy;
    }

    public void setWeekDayStrategy(WeekDayStrategy weekDayStrategy) {
        this.weekDayStrategy = weekDayStrategy;
    }
}
