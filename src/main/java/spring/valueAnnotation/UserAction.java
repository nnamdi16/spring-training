package spring.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class UserAction {
    @Value("${cp.user.name}")
    private String username;

    @Value("${cp.user.actionType}")
    private String actionType;

    @Value("${cp.user.designation}")
    protected Designation designation;

    public void show() {
        System.out.println(username);
        System.out.println(actionType);
        System.out.println(designation);
    }
}
