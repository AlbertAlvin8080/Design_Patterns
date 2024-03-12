package org.designpatterns.decorator.E01_Interceptor.decorator;

import org.designpatterns.decorator.E01_Interceptor.contract.Interceptor;
import org.designpatterns.decorator.E01_Interceptor.contract.Job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerInterceptor extends Interceptor {
    private String message;

    public LoggerInterceptor(Job job, String message) {
        super(job);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public void doJob() {
        final String formatted = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss").format(new Date());
        System.out.printf("%s -> %s%n", formatted, message);
        super.job.doJob();
    }
}
