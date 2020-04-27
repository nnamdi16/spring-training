package spring.profileAnnotation.profileExpression;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("eligible & free")
public class HomeConfig {
    @Bean
    public Work getWork() {
        return new Work("Staying at home");
    }
}
