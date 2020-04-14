package spring.beanScope.prototype.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        LearningService learningService = context.getBean(LearningService.class);
        learningService.setName("Prototype Scope all testing...");
        System.out.println(learningService.getName());

        LearningService learningService1 = context.getBean(LearningService.class);
        System.out.println(learningService1.getName());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        LearningService learningService2 = context1.getBean("prototype", LearningService.class);
        learningService2.setName("Spring prototype is all around");
        System.out.println(learningService2.getName());

        LearningService learningService3 = context1.getBean("prototype", LearningService.class);
        System.out.println(learningService3.getName());

//        ((ClassPathXmlApplicationContext) context1).close();
    }
}
