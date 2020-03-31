package spring.dependencyInjectionJavaConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.dependencyInjectionJavaConfig.config.AppConfiguration;
import spring.dependencyInjectionJavaConfig.constructor.ConstructorBasedInjection;

public class BeanApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection constructorBasedInjection = context.getBean(ConstructorBasedInjection.class);
        constructorBasedInjection.processMsg("Shelter in the time of Storm ");
        constructorBasedInjection.processMessage("Ruth the drinker is drinking");
    }
}
