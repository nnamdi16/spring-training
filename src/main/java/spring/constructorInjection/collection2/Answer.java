package spring.constructorInjection.collection2;

public class Answer {
    private int id;
    private String name;
    private String author;

    public Answer() {
    }

    public Answer(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + author;
    }
}
