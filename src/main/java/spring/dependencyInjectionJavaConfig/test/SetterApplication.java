package spring.dependencyInjectionJavaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.dependencyInjectionJavaConfig.config.AppConfiguration;
import spring.dependencyInjectionJavaConfig.setter.SetterBasedInjection;

public class SetterApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
        setterBasedInjection.processMessage("We are sending everyone a message of hope and Joy");
    }
}
