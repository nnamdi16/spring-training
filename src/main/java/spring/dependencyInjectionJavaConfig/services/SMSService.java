package spring.dependencyInjectionJavaConfig.services;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService {
    @Override
    public void sendMsg(String message) {
        System.out.println("SMSService: " + message);
    }
}
