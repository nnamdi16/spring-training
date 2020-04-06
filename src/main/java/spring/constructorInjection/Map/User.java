package spring.constructorInjection.Map;

public class User {
    private int id;
    private String name, email;

    public User() {
    }

    public User(int id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + ", email='" + email;
    }
}
