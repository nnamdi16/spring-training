package spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdEnvConfig {

    @Bean
    public Blogger blogger() {
        return new Blogger("Prod User");
    }
}
