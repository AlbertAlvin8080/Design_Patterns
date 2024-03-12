package org.designpatterns.decorator.E01_Interceptor.decorated;

import org.designpatterns.decorator.E01_Interceptor.contract.Job;

public class HardWorkJob implements Job {
    public void doJob() {
        System.out.println("Doing hardworking job...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hard work job done.");
    }
}
