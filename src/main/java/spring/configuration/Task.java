package spring.configuration;

import org.springframework.scheduling.annotation.Scheduled;

public class Task {
    @Scheduled(fixedRate = 10000)
    public void doTask() {
        System.out.println("Work is in Progress.........");
    }
}
