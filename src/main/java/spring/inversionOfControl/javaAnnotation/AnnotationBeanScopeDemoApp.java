package spring.inversionOfControl.javaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //Load the spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");

        //Get the bean from the spring container
        Engineer engineer = context.getBean("javaEngineer", Engineer.class);
        Engineer sampleEngineer = context.getBean("javaEngineer",Engineer.class);

        //Check if they are the same
        boolean result = (engineer == sampleEngineer);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location for engineer: " + engineer);
        System.out.println("\n Memory location for sampleEngineer: " + sampleEngineer + "\n");

        //close the context
        context.close();


    }
}
