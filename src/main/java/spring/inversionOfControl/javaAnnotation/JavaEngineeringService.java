package spring.inversionOfControl.javaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JavaEngineeringService implements EngineeringService {
    @Override
    public String getEngineeringService() {
        return "Today is your lucky day! with engineering services - Work it up!!! ";
    }
}
