package spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:property/myproject.properties")
public class TheAppConfig {
    @Value("${cp.user.country}")
    private String country;

    @Value("${cp.user.role}")
    private String role;
    /**
     * Injecting externalized values and other beans using @Autowired
     * inside @Configuration classes
     */
    @Autowired
    Environment env;


    @Bean
    public Blogger theUser() {
        System.out.println("Country: " + country);
        System.out.println("Role: " + role);
        System.out.println(env.getProperty("java.home") + " Thinking loud");
        return new Blogger("travis124");
    }

}
