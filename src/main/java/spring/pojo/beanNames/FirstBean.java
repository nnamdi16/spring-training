package spring.pojo.beanNames;

public class FirstBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initMethod() {
        System.out.println("Initializing work" + " " + name);
    }

    public void destroyMethod() {
        System.out.println("Closing work");

    }
}
