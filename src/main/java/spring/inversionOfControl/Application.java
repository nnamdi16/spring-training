package spring.inversionOfControl;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        HelloWorld greeting = (HelloWorld)context.getBean("greetings");
        greeting.getMessage();


        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld appConfig = (HelloWorld)configApplicationContext.getBean("helloWorld");
        appConfig.getMessage();
        configApplicationContext.close();

        AnnotationConfigApplicationContext configGreeting = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld appConfiguration = (HelloWorld)configGreeting.getBean("greetings");
        appConfiguration.getMessage();
        configGreeting.close();

//        Implementation of Bean factory
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        HelloWorld helloObj = (HelloWorld)factory.getBean("greetings");
        helloObj.getMessage();
    }
}
