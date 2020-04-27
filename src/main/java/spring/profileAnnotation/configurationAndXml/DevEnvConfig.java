package spring.profileAnnotation.configurationAndXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevEnvConfig {
    @Bean
    public User getUser() {
        return new User(200, "Dev User");
    }
}
