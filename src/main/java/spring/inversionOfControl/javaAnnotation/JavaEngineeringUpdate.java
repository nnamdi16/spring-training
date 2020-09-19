package spring.inversionOfControl.javaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JavaEngineeringUpdate implements EngineeringUpdate {

    @Override
    public String getEngineeringUpdate() {
        return "Java 14 is here again";
    }
}
