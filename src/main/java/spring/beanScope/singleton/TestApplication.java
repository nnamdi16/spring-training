package spring.beanScope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.setName("Singleton scope test");
        System.out.println(userService.getName());

        UserService userService1 = context.getBean(UserService.class);
//        userService1.setName("Singleton scoping....");
        System.out.println(userService1.getName());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService2 = context1.getBean("singleton", UserService.class);
        System.out.println(userService2.getName());

        UserService userService3 = context1.getBean("singleton", UserService.class);
        System.out.println(userService3.getName());

    }
}
/*
 * Since userService is in singleton scope the second retrieval by userService1 will display the message set by userService,
 * even it's retrieve by a new getBean() method
 * In singleton a single instance per spring IOC container
 *  no matter how many time you retrieve it with getBean(), it will always return the same instance.*/