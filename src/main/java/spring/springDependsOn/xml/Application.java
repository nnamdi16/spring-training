package spring.springDependsOn.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FirstBean firstBean = context.getBean("firstBean", FirstBean.class);

        firstBean.populateBeans();

    }
}
