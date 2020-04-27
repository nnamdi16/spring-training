package spring.profileAnnotation.profileExpression;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileExpressionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("eligible", "busy");
        context.scan("spring.profileAnnotation.profileExpression");
        context.refresh();
        Work work = context.getBean(Work.class);
        System.out.println(work.desc);
    }
}
