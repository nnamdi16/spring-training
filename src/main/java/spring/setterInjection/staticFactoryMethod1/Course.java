package spring.setterInjection.staticFactoryMethod1;

public class Course {
    private static final Course obj = new Course();

    private Course() {
        System.out.println("Private Constructor");
    }

    public static Course getCourse() {
        System.out.println("Factory Method");
//        return course;
        return null;
    }

    public void msg() {
        System.out.println("Hello User");
    }
}
