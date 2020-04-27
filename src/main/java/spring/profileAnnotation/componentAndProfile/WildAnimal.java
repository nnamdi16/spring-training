package spring.profileAnnotation.componentAndProfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("lion")
public class WildAnimal implements Animal {
    @Override
    @Bean
    public String getMessage() {
        return "Hello Lion!";
    }
}
