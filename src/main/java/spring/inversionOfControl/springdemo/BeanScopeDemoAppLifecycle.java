package spring.inversionOfControl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoAppLifecycle {
    public static void main(String[] args) {
        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //Close the context
        context.close();
    }
}
//Bean scope is the lifecycle of a bean.
//It tells how long the bean would live
//It tells how many instances would be created and also the bean is shared.

//Singleton bean creates only one instance of the bean, it is cached in memory, all request for the bean will return a shared reference to the same bean
//Prototype scope bean are good for stateful data.

//Bean lifecycle entails
//-Bean instantiated
//Dependency is injected
//Internal Spring processing
//Your custom Init method
//Bean is ready for use and container shut down - Custom destroy method before the bean lifecycle is over

//For both bean initialization
// - Calling custom business logic methods
// - Setting up handles to resources (db, socket, file)
// and bean destruction
// - Calling custom business logic method
// - Clean up handles to resources(db, socket, files)
