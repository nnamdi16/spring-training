package spring.nestedAtConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.nestedAtConfiguration")
public class OuterConfig {

    @Autowired
    InnerWork innerWork;

    @Bean
    public OuterTask getOuterTask() {
        return new OuterTask("Outer Task");
    }

    @Bean
    public OuterWork getOuterWork() {
        System.out.println(innerWork.getName());
        return new OuterWork("Best outer Work");
    }

    @Configuration
    public static class InnerConfig {
        @Bean
        public InnerTask getInnerTask() {
            return new InnerTask("Inner Task");
        }

        @Bean
        public InnerWork getInnerWork() {
            return new InnerWork("Best Inner Work");
        }
    }
}

/***
 * Spring @Configuration is annotated at class level to indicate that
 * a class declares one or more bean
 * @Configuration classes can be nested with one another.
 * This also involves registering only outer configuration class against application context
 * which will bootstrap nested configuration classes.
 * Nested configuration classes helps to avoid the use of @Import
 * Other annotations used along side with @Configuration:
 * @PropertySource:a convenient and declarative mechanism for adding a property source to Spring's Environment
 * @Profile: enables the configuration classes to be registered when specified profiles are active.
 * @EnableScheduling: enables Spring's scheduled task execution capability.
 * @ImportResource: indicates one or more resources containing bean definition to import
 * @Import: indicates one or more @Configuration classes to import
 * @ComponentScan: configures component scanning directives for use with @Configuration classes
 * @EnableWebMvc: provides Spring MVC configuration
 * @EnableWebSecurity: Provides Spring Security configuration.
 */