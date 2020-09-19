package spring.inversionOfControl.javaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JavaEngineer implements Engineer {
    @Override
    public String getDailyCoding() {
        return "Practice Java Coding Skills";
    }
}
