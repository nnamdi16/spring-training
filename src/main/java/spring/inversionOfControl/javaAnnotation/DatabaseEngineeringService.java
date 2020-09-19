package spring.inversionOfControl.javaAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
//@Qualifier("databaseEngineeringService")
public class DatabaseEngineeringService implements EngineeringService {

    //create an array of strings
    private String[] data = {
            "Beware of the wolf's in Sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //Create a random number generator
    private Random random = new Random();

    @Override
    public String getEngineeringService() {

        //Pick a random string from the array
        int index = random.nextInt(data.length);
        String theServiceWords = data[index];

        return "Database Engineering Service: " + theServiceWords ;
    }
}
