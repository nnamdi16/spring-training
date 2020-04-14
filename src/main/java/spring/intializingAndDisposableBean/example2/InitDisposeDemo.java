package spring.intializingAndDisposableBean.example2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDisposeDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InitDisposeService service = (InitDisposeService) context.getBean("service");
        service.doSomething();
        context.close();
    }
}
