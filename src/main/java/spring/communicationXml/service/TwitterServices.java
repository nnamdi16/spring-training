package spring.communicationXml.service;

public class TwitterServices implements MessageServices {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessages() {
        System.out.println("TwitterServices: " + message);

    }
}
