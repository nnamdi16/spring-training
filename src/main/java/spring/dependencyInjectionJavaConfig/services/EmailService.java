package spring.dependencyInjectionJavaConfig.services;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService {


    @Override
    public void sendMsg(String message) {
        System.out.println("EmailService: " + message);
    }
}
