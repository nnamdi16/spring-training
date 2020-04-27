package spring.profileAnnotation.profileAndBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
    @Profile({"cow", "sheep", "goat"})
    DomesticAnimals domesticAnimals() {
        return new DomesticAnimals();
    }

    @Bean
    @Profile({"Lion", "tiger"})
    WildLife wildLife() {
        return new WildLife();
    }
}
