package spring.communicationXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationChannel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommunicationChannel communicationChannel = context.getBean("communicationChannel", CommunicationChannel.class);
        CommunicationChannel otherCommunicationChannel = context.getBean("newTechCommunicationChannel", CommunicationChannel.class);
//        communicationChannel.newTechCommunication();
        communicationChannel.selectCommunication();
        otherCommunicationChannel.newTechCommunication();
    }
}
