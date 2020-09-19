package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("javascriptEngineerService")
public class JavascriptEngineerService implements EngineeringService{
    @Override
    public String getEngineeringService() {
        return "Javascript Engineering using MERN, VERN or PEAN stack";
    }
}
