package spring.pojo.innerBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        School school = context.getBean(School.class);
        System.out.println(school.getPrincipal());
        System.out.println(school.getSchoolName());
        context.registerShutdownHook();
        context.close();
    }
}
