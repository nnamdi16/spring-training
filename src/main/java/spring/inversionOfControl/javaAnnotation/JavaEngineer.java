package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaEngineer implements Engineer {

    private EngineeringService engineeringService;

    //Constructor
    @Autowired
    public JavaEngineer(EngineeringService theEngineeringService) {
        engineeringService = theEngineeringService;
    }

    @Override
    public String getDailyCoding() {
        return "Practice Java Coding Skills";
    }

    @Override
    public String getDailyEngineeringService() {
        return engineeringService.getEngineeringService();
    }
}
