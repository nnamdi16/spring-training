package spring.profileAnnotation.configurationAndXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Profile enables a component to be registered when specified profiles are active
 * It can be activated programmatically(using setActiveProfiles and ConfigurableEnvironment)
 * or declaratively(using spring.profiles.active as a JVM system property or as an environment variable or as a servlet parameter in web.xml).
 * A component can have more than one profile name or profile expression.
 * A component is registered if specified profiles are active or profile expression returns true
 * @ActiveProfiles to activate profiles in spring test.
 * It can be used with:
 * @Configuration
 * @Component
 * @Service
 * @Repository
 * @Controller
 * @Bean profile attribute is used to define a profile in xml
 */

@Configuration
@Profile("prod")
public class ProdEnvConfig {
    @Bean
    public User getUser() {
        return new User(100, "Prod User");
    }
}
