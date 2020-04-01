package spring.springDependsOn.annotation;

public class SecondBean {
    public SecondBean() {
        System.out.println("SecondBean Initialized via constructor");
    }

    public void display() {
        System.out.println("SecondBean method called");
    }
}
