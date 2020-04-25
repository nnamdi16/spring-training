package spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Configuration classes can be accessed using AnnotationConfigApplicationContext(used to
 * register configuration classes using constructor, register() or scan() method)
 * In constructor and register method we specify configuration classes
 * In constructor and scan method we specify package name. Scan method can scan both package and sub-packages.
 */
public class MySpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Blogger blogger1 = context1.getBean("theNextUser", Blogger.class);
        System.out.println("First Username :" + blogger1.getUserName());

        context.getEnvironment().setActiveProfiles("dev");
//        context.scan("spring.configuration");
        context.register(DevEnvConfig.class);
        context.refresh();
        Blogger user = context.getBean(Blogger.class);
        System.out.println("User name: " + user.getUserName());
        context.registerShutdownHook();
        context.close();
    }
}
