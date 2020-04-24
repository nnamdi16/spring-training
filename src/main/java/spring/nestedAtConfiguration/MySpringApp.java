package spring.nestedAtConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OuterConfig.class);
        OuterTask outerTask = context.getBean(OuterTask.class);
        System.out.println(outerTask.getName());
//        InnerTask innerTask = context.getBean(InnerTask.class);
////        System.out.println(innerTask.getName());
//        OuterWork outerTask1 = context.getBean(OuterWork.class);
////        System.out.println(outerTask1.getName());
//        InnerWork innerWork = context.getBean(InnerWork.class);
////        System.out.println(innerWork.getName());
        context.registerShutdownHook();
        context.close();
    }
}
