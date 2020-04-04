package spring.lazyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyApplication {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
//        FirstBean firstBean = context.getBean(FirstBean.class);
//        firstBean.test();
//        context.close();

        ApplicationContext contexts = new ClassPathXmlApplicationContext("applicationContext.xml");
        FirstBeans firstBean1 = contexts.getBean("firstBeans", FirstBeans.class);
        firstBean1.test();
    }
}
