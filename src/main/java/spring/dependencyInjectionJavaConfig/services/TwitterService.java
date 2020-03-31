package spring.dependencyInjectionJavaConfig.services;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService {

    @Override
    public void sendMsg(String message) {
        System.out.println("TwitterService: " + message);
    }
}
