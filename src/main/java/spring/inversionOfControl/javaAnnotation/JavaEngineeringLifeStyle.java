package spring.inversionOfControl.javaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JavaEngineeringLifeStyle implements EngineeringLifeStyle {

    @Override
    public String getEngineeringLifeStyle() {
        return "Engineering Lifestyle of coding at all time is essential for once";
    }
}
