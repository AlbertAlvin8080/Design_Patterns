package org.designpatterns.strategy.E01_weekdays.instances;

import org.designpatterns.strategy.E01_weekdays.contract.WeekDayStrategy;

public class Thursday implements WeekDayStrategy {
    @Override
    public void evaluateWeekDay() {
        System.out.println("It's Thursday!");
    }
}
