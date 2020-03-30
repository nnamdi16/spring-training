package spring.inversionOfControl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Configuration annotation indicates that the class has @Bean definition method
//So Spring container can process the class and generate Spring Beans to be used in the application
public class AppConfig {
    @Bean
    public HelloWorld helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("We are saying Hello World");
        return helloWorld;
    }

    @Bean
    public HelloWorld greetings() {
        HelloWorld greetings = new HelloWorld();
        greetings.setMessage("We are rising to greet every day");
        return greetings;
    }
}
