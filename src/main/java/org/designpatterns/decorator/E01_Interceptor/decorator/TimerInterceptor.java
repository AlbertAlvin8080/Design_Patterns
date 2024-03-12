package org.designpatterns.decorator.E01_Interceptor.decorator;

import org.designpatterns.decorator.E01_Interceptor.contract.Interceptor;
import org.designpatterns.decorator.E01_Interceptor.contract.Job;

public class TimerInterceptor extends Interceptor {
    public TimerInterceptor(Job job) {
        super(job);
    }

    @Override
    public void doJob() {
        final long start = System.currentTimeMillis();
        super.job.doJob();
        final long end = System.currentTimeMillis();
        System.out.printf("Elapsed time: %sms%n", (end - start));
    }
}
