package spring.inversionOfControl.javaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Java Annotations are special labels/marks added to the Java classes
        //They provide meta-data about the class
        // Processed at compile time or run-time for special processing
        //Spring scans classes for special annotation and automatically register the bean in the spring container

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");

        //Get the bean from the spring container
        Engineer engineer = context.getBean("javaEngineer", Engineer.class);

        //Call a method on the bean
        System.out.println(engineer.getDailyCoding());

        //call method to get the daily engineering service.
        System.out.println(engineer.getDailyEngineeringService());

        //Close the context
        context.close();


    }
}
