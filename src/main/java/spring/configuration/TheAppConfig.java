package spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class TheAppConfig {
    /**
     * Injecting externalized values and other beans using @Autowired
     * inside @Configuration classes
     */
    @Autowired
    Environment env;


    @Bean
    public Blogger theUser() {
        System.out.println(env.getProperty("java.home") + " Thinking loud");
        return new Blogger("travis124");
    }

}
