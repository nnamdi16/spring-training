package spring.profileAnnotation.configurationAndXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.scan("spring.profileAnnotation");
        context.refresh();
        User user = context.getBean(User.class);
        System.out.println("id: " + user.id + ", Name: " + user.name);

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Production Environment
        context1.getEnvironment().setActiveProfiles("prod");
        context1.refresh();
        User user1 = context1.getBean(User.class);
        System.out.println("id:" + user1.id + ", Name:" + user1.name);

        //Development Environment
        context1.getEnvironment().setActiveProfiles("dev");
        context1.refresh();
        user1 = (User) context1.getBean("user");
        System.out.println("id: " + user1.id + ", Name:" + user1.name);


        //Testing Environment Profile
        context1.getEnvironment().setActiveProfiles("test");
        context1.refresh();
        user1 = (User) context1.getBean("user");
        System.out.println("id: " + user1.id + "Name: " + user1.name);

    }
}
