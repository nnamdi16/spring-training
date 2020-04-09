package spring.setterInjection.collection1;

import java.util.Iterator;
import java.util.List;

public class Tweet {
    private int id;
    private String name;
    private List<String> reply;

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

    public List<String> getReply() {
        return reply;
    }

    public void setReply(List<String> reply) {
        this.reply = reply;
    }

    public void displayTweet() {
        System.out.println(id + " " + name);
        System.out.println("answers are :");
        Iterator<String> iterator = reply.iterator();
    }
}
