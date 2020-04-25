package spring.configuration;

public class Blogger {
    private String adminName;

    public Blogger(String adminName) {
        this.adminName = adminName;
        System.out.println("----Initializing users-------");
    }

    public String getUserName() {
        return adminName;
    }
}
