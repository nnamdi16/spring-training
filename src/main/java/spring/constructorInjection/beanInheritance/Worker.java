package spring.constructorInjection.beanInheritance;

//By using the parent attribute of bean, we can specify the inheritance relation between the beans
// In such case, parent bean values will be inherited to the current bean.
public class Worker {
    private int id;
    private String name;
    private Location location;


    public Worker() {

    }

    public Worker(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Worker(int id, String name, Location location) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(location);
    }
}
