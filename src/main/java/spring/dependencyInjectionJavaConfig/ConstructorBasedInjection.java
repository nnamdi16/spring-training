package spring.dependencyInjectionJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
    private MessageService messageService;
    private MessageService messageService1;
    private MessageService messageService2;

    @Autowired(required = false)
    public ConstructorBasedInjection(@Qualifier("TwitterService") MessageService messageService, @Qualifier("SMSService") MessageService messageService1, @Qualifier("EmailService") MessageService messageService2) {
        super();
        this.messageService = messageService;
        this.messageService1 = messageService1;
        this.messageService2 = messageService2;
    }

    @Autowired(required = false)
    public ConstructorBasedInjection(@Qualifier("EmailService") MessageService messageService2) {
        super();
        this.messageService2 = messageService2;
    }

    public void processMsg(String message) {
        messageService.sendMsg(message);
        messageService1.sendMsg(message);
        messageService2.sendMsg(message);
    }

    public void processMessage(String messages) {
        messageService.sendMsg(messages);
        messageService2.sendMsg(messages);
    }
}
