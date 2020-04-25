package spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevEnvConfig {
    @Bean
    public Blogger blogger() {
        return new Blogger("Dev User");
    }
}
