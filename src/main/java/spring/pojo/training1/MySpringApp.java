package spring.pojo.training1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanA beanA = (BeanA) ctx.getBean("getBeanA");
        BeanB beanB = (BeanB) ctx.getBean("getBeanB");
        System.out.println(beanA.getName());
        System.out.println(beanB.getName());
        ctx.registerShutdownHook();
        ctx.close();
    }
}
