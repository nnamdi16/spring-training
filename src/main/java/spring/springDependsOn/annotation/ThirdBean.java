package spring.springDependsOn.annotation;

public class ThirdBean {

    public ThirdBean() {
        System.out.println("ThirdBean initialized via constructor");
    }

    public void display() {
        System.out.println("Third bean method called");
    }
}
