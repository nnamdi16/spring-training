package spring.pojo.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Utility {
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Bean
    public Square getSquare() {
        return new Square();
    }
}
