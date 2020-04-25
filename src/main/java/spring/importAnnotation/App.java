package spring.importAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApplication.class);
        Worker worker = context.getBean(Worker.class);
        System.out.println(worker.getWorkerName());
        context.registerShutdownHook();
        context.close();
    }
}
