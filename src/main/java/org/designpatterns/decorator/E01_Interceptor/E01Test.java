package org.designpatterns.decorator.E01_Interceptor;

import org.designpatterns.decorator.E01_Interceptor.contract.Interceptor;
import org.designpatterns.decorator.E01_Interceptor.contract.Job;
import org.designpatterns.decorator.E01_Interceptor.decorated.HardWorkJob;
import org.designpatterns.decorator.E01_Interceptor.decorator.LoggerInterceptor;
import org.designpatterns.decorator.E01_Interceptor.decorator.SecondsVerifierInterceptor;
import org.designpatterns.decorator.E01_Interceptor.decorator.TimerInterceptor;

public class E01Test {
    public static void main(String[] args) {
        System.out.println();
        final Job job = new HardWorkJob();
        final Interceptor timerInterceptor = new TimerInterceptor(job);
        final Interceptor loggerInterceptor = new LoggerInterceptor(timerInterceptor, "initializing job...");
        final Interceptor secondsVerifierInterceptor = new SecondsVerifierInterceptor(loggerInterceptor);
        secondsVerifierInterceptor.doJob();
    }
}
