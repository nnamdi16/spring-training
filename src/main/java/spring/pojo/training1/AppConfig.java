package spring.pojo.training1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BeanA getBeanA() {
        BeanA beanA = new BeanA();
        beanA.setName("Bean A");
        return beanA;
    }


    @Bean
    public BeanB getBeanB() {
        return new BeanB("Bean B");
    }
}


/**
 * Spring @Bean annotation indicates that a method produces a bean managed by the Spring container
 * It can be created with @Configuration and @Component classes
 */