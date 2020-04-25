package spring.importResources;

import org.springframework.context.annotation.Profile;

@Profile("client")
public class Client {
    private String accessName;

    public Client(String accessName) {
        this.accessName = accessName;
    }

    public String getAccessName() {
        return accessName;
    }
}
