package spring.configuration;

import org.springframework.scheduling.annotation.Scheduled;

public class Task {
    @Scheduled(fixedDelay = 10000)
    public void doTask() {
        System.out.println("Work is in Progress.........");
    }
}
