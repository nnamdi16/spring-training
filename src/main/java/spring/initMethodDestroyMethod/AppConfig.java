package spring.initMethodDestroyMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public DataStore dataStore() {
        return new DataStore();
    }
}
