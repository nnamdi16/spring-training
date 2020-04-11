package spring.setterInjection.nonStringCollection;

import java.util.Iterator;
import java.util.List;

public class Feed {
    private int id;
    private String name;
    private List<Response> response;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("responses are: ");
        Iterator<Response> iterator = response.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
