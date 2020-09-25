package spring.inversionOfControl.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //Read spring config java class


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the bean from the spring container
//        Coach theCoach = context.getBean("swimCoach",SwimCoach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //Call our new swim coach methods ... has the prop values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team : " + theCoach.getTeam());

        //close the context
        context.close();


    }
}
