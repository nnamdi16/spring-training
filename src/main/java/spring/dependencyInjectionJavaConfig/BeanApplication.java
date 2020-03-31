package spring.dependencyInjectionJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection constructorBasedInjection = context.getBean(ConstructorBasedInjection.class);
        constructorBasedInjection.processMsg("Shelter in the time of Storm ");
        constructorBasedInjection.processMessage("Ruth the drinker is drinking");
    }
}
