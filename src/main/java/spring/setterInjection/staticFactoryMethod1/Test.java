package spring.setterInjection.staticFactoryMethod1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Course course = (Course) context.getBean("course1");


}
