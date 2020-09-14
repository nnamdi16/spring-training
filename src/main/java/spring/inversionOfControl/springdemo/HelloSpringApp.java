package spring.inversionOfControl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp  {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach",Coach.class);
        Coach coach1 = context.getBean("baseballCoach",Coach.class);


        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());

        System.out.println(coach.getDailyFortune());


        //close context
        context.close();
    }
}
