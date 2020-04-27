package spring.profileAnnotation.profileAndBeanAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("Lion");
        context.scan("spring.profileAnnotation.profileAndBeanAnnotation");
        context.refresh();
        WildLife wildLife = context.getBean(WildLife.class);
        System.out.println(wildLife.getMessage());
    }
}
