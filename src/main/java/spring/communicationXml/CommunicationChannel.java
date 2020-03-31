package spring.communicationXml;

public class CommunicationChannel {
    private MessageServices twitterServices;
    private MessageServices emailServices;
    private MessageServices smsServices;

    public CommunicationChannel(MessageServices twitterServices, MessageServices emailServices) {
        super();
        this.twitterServices = twitterServices;
        this.emailServices = emailServices;
    }

    public CommunicationChannel(MessageServices smsServices) {
        super();
        this.smsServices = smsServices;
    }

    public void selectCommunication() {
        emailServices.sendMessages();
        twitterServices.sendMessages();
    }

    public void newTechCommunication() {

        smsServices.sendMessages();
    }
}
