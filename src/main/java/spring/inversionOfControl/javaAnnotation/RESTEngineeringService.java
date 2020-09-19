package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("RESTEngineeringService")
public class RESTEngineeringService implements EngineeringService {
    @Override
    public String getEngineeringService() {
        return "RESTEngineering Service is here!!!!";
    }
}
