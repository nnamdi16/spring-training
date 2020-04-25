package spring.importResources;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSetup {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("client");
        context.register(ConfigApp.class);
        context.refresh();
        Client client = context.getBean("accessName", Client.class);
        System.out.printf(client.getAccessName());
        context.registerShutdownHook();
        context.close();

    }
}
