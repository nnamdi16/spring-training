package spring.setterInjection.setterInjectionNonStringMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ExamQuestion question = context.getBean("review", ExamQuestion.class);
        question.displayInfo();
    }
}
