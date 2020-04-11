package spring.setterInjection.nonStringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Feed feed = context.getBean("feed", Feed.class);
        feed.displayInfo();
    }
}
