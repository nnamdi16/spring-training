package spring.configuration;

public class User {
    private String userName;

    public User(String username) {
        this.userName = username;
        System.out.println("----Initializing users-------");
    }

    public String getUserName() {
        return userName;
    }
}
