package spring.beanScope.prototype.example2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan annotation scans all beans whose class
 * is annotated by @Component annotation
 */
@Configuration
@ComponentScan(basePackages = "spring.beanScope.prototype.example2")
public class AppConfig {

}
