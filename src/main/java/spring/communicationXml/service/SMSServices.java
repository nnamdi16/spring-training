package spring.communicationXml.service;

public class SMSServices implements MessageServices {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessages() {
        System.out.println("SMSServices: " + message);
    }
}
