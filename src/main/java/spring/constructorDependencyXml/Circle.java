package spring.constructorDependencyXml;

public class Circle implements Shape {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String draw() {
        System.out.println("Inside the draw method " + message);
        return message;
    }
}
