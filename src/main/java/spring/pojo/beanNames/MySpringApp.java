package spring.pojo.beanNames;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean beanA = (FirstBean) context.getBean("firstBean1");
        System.out.println(beanA.getName());
        beanA.setName("Brenda Shaw");
        System.out.println(beanA.getName());

        FirstBean beanB = (FirstBean) context.getBean("firstBean2");
        beanB.setName("Code 8");
        System.out.println(beanB.getName());

//        SecondBean secondBean = (SecondBean) context.getBean("secondBean1");
//        System.out.println(secondBean.getName());
//
//
//        SecondBean secondBeanName = new SecondBean("Ozarks");
//        SecondBean secondBean2 = (SecondBean) context.getBean("secondBean2");
//        System.out.println(secondBeanName.getName());
//        System.out.println(secondBean2.getName());

        context.registerShutdownHook();
        context.close();
    }
}
