package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("javaEngineeringService")
public class JavaEngineeringService implements EngineeringService {
    @Override
    public String getEngineeringService() {
        return "Today is your lucky day! with engineering services - Work it up!!! ";
    }
}
