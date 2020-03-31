package spring.dependencyInjectionJavaConfig.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.dependencyInjectionJavaConfig.services.MessageService;

@Component
public class SetterBasedInjection {
    private MessageService twitterService;
    private MessageService emailService;
    private MessageService smsService;

    @Autowired
    @Qualifier("TwitterService")
    public void setTwitterService(MessageService twitterService) {
        this.twitterService = twitterService;
    }

    @Autowired
    @Qualifier("EmailService")
    public void setEmailService(MessageService emailService) {
        this.emailService = emailService;
    }

    @Autowired
    @Qualifier("SMSService")
    public void setSmsService(MessageService smsService) {
        this.smsService = smsService;
    }

    public void processMessage(String message) {
        twitterService.sendMsg(message);
        emailService.sendMsg(message);
        smsService.sendMsg(message);
    }
}
