package spring.profileAnnotation.profileExpression;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("eligible & busy")
public class JobConfig {
    @Bean
    public Work getWork() {
        return new Work("Doing my job");
    }
}
