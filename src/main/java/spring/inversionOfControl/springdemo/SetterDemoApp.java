package spring.inversionOfControl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        //Call methods on the bean
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        //Close the context
        context.close();
    }
}
