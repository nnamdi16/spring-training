package spring.profileAnnotation.componentAndProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"cow", "buffalo", "goat"})
public class DomesticAnimal implements Animal {
    @Override
    public String getMessage() {
        return "Hello Domestic Animal!";
    }
}
