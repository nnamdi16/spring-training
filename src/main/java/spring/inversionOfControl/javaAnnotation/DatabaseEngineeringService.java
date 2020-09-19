package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("databaseEngineeringService")
public class DatabaseEngineeringService implements EngineeringService {
    @Override
    public String getEngineeringService() {
        return "Database Engineering Service";
    }
}
