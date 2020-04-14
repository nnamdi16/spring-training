package spring.beanLifeCycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.beanLifeCycle.config.AppConfiguration;
import spring.beanLifeCycle.service.MessageProcessor;

public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageProcessor userService = context.getBean(MessageProcessor.class);
        userService.processMsg("Twitter message sending");
    }
}
