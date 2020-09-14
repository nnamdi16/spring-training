package spring.inversionOfControl.springdemo;

public class MyApp {

    /*
    Inversion of Control creates and manages objects.
    Dependency Injection injects object dependencies.
    Spring container - object factory
    Configuring Spring Container
    - XML configuration file,
    - Java Annotations,
    - Java Source Code.
    Spring container is generally known as ApplicationContext
    Dependency injection principle states that the client delegates calls to another
    object the responsibility of providing its dependencies.
    */
    public static void main(String[] args) {
        //Create the object
//        Coach theCoach = new BaseBallCoach();
        Coach theCoach1 = new TrackCoach();

        //use the object
//        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach1.getDailyWorkout());
    }

}
