package org.designpatterns.decorator.E01_Interceptor.contract;

public abstract class Interceptor implements Job {
    protected Job job;

    public Interceptor(Job job) {
        this.job = job;
    }
}
