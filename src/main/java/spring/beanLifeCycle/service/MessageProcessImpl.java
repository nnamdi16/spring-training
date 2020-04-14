package spring.beanLifeCycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessImpl implements MessageProcessor {
    private MessageService messageService;

    @Autowired
    public MessageProcessImpl(@Qualifier("TwitterService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
