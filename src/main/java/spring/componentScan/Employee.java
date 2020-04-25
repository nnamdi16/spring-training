package spring.componentScan;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String userName = "Travis Greene";

    public String getUserName() {
        return userName;
    }
}
