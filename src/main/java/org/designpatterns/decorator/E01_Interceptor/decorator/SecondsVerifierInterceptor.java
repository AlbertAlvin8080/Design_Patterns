package org.designpatterns.decorator.E01_Interceptor.decorator;

import org.designpatterns.decorator.E01_Interceptor.contract.Interceptor;
import org.designpatterns.decorator.E01_Interceptor.contract.Job;

import java.util.Calendar;

public class SecondsVerifierInterceptor extends Interceptor {
    public SecondsVerifierInterceptor(Job job) {
        super(job);
    }

    @Override
    public void doJob() {
        final Calendar calendar = Calendar.getInstance();
        final int i = calendar.get(Calendar.SECOND);
        System.out.println("Verifying seconds...");
        if(i % 2 == 0) {
//            throw new RuntimeException("Interrupted Execution in even second -> " + calendar.getTime());
        }
        super.job.doJob();
    }
}
