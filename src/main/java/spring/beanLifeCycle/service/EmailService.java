package spring.beanLifeCycle.service;

public class EmailService implements MessageService {
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
