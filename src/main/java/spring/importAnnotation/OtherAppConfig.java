package spring.importAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherAppConfig {
    @Bean
    public Worker getWorker() {
        return new Worker("Moody");
    }
}
