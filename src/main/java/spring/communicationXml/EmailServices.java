package spring.communicationXml;

public class EmailServices implements MessageServices {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendMessages() {
        System.out.println("EmailServices: " + message);
    }
}
