package spring.profileAnnotation.componentAndProfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("goat");
        context.scan("spring.profileAnnotation.componentAndProfile");
        context.refresh();
        Animal animal = context.getBean(Animal.class);
        System.out.println(animal.getMessage());
    }
}
