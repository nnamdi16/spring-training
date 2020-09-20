package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
//@Scope("prototype")
public class JavaEngineer implements Engineer {

//    @Autowired
//    @Qualifier("javaEngineeringService")
    private EngineeringService engineeringService;

    private EngineeringLifeStyle engineeringLifeStyle;

    @Autowired
    private EngineeringUpdate engineeringUpdate;

    @Autowired
    private JavaEngineeringUpdate javaEngineeringUpdate;

    //define a default constructor
    public JavaEngineer() {
        System.out.println(">> JavaEngineer: inside default constructor");
    }

    //Constructor
    @Autowired
    public JavaEngineer(@Qualifier("databaseEngineeringService") EngineeringService engineeringService) {
        this.engineeringService = engineeringService;
    }

    @Autowired
    public void setEngineeringLifeStyle(EngineeringLifeStyle engineeringLifeStyle) {
        System.out.println(">> Inside the setter method");
        this.engineeringLifeStyle= engineeringLifeStyle;
    }

    @Autowired
    public void doSomeCrazyCoding(EngineeringLifeStyle engineeringLifeStyle) {
        System.out.println(">> Inside the doSomeCrazyCoding method");
        this.engineeringLifeStyle= engineeringLifeStyle;
    }

    @Override
    public String getDailyCoding() {
        return "Practice Java Coding Skills";
    }

    @Override
    public String getDailyEngineeringService() {

        String[] engineeringServices = new String[4];
        engineeringServices[0] = engineeringService.getEngineeringService();
        engineeringServices[1] = engineeringLifeStyle.getEngineeringLifeStyle();
        engineeringServices[2] = engineeringUpdate.getEngineeringUpdate();
        engineeringServices[3] = javaEngineeringUpdate.getEngineeringUpdate();

//        return Arrays.toString(engineeringServices);
        return Arrays.deepToString(engineeringServices);

    }

    //init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> JavaEngineer: inside of doMyStartupStuff() ");
    }

    //Destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println(">> JavaEngineer: inside my doMyCleanupStuff()");
    }






}
