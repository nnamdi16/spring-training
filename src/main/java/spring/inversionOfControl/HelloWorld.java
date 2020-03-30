package spring.inversionOfControl;

public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("The Message " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
