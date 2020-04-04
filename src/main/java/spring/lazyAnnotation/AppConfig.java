package spring.lazyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Lazy
    @Bean
    public FirstBeans firstBeans() {
        return new FirstBeans();
    }


    @Bean
    public SecondBeans secondBeans() {
        return new SecondBeans();
    }
}
