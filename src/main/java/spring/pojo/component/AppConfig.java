package spring.pojo.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.pojo.component")
public class AppConfig {
}

/***
 * Methods are processed in lite mode
 * @Bean method would be treated as plain factory methods by the container and follows scoping and lifecycle callbacks
 * The difference between @Bean methods of @Configuration and @Component classes is that
 * beans of @Component classes do not support inner bean reference
 */


