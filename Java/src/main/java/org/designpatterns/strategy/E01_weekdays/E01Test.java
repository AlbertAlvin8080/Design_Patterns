package org.designpatterns.strategy.E01_weekdays;

import org.designpatterns.strategy.E01_weekdays.client.WeekDayEvaluatorClient;
import org.designpatterns.strategy.E01_weekdays.instances.Friday;
import org.designpatterns.strategy.E01_weekdays.instances.Sunday;
import org.designpatterns.strategy.E01_weekdays.instances.Wednesday;

public class E01Test {
    public static void main(String[] args) {
        final WeekDayEvaluatorClient context = new WeekDayEvaluatorClient(new Sunday());
        context.evaluateWeekDay();
        context.setWeekDayStrategy(new Friday());
        context.evaluateWeekDay();
        context.setWeekDayStrategy(new Wednesday());
        context.evaluateWeekDay();
    }
}
