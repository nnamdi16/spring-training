package spring.pojo.innerBean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanApp {

    @Bean
    public Person getPerson() {
        return new Person("Mahesh");
    }

    @Bean
    public School getSchool() {
        return new School(getPerson());
    }
}
