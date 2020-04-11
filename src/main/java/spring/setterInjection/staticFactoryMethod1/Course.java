package spring.setterInjection.staticFactoryMethod1;

public class Course {
    private static final Course obj = new Course();

    private Course() {
        System.out.println("Private Constructor");
    }

    public static Course getObj() {
        System.out.println("Factory method");
        return obj;
    }

    public void msg() {
        System.out.println("Hello User");
    }
}
