package spring.inversionOfControl.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.inversionOfControl.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    //Define bean for sad fortune service

    @Bean
    public FortuneService sadFortuneService() {
        return  new SadFortuneService();
    }

    //Define bean for swim coach and inject dependencies
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
