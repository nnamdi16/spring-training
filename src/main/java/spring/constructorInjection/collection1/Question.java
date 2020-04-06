package spring.constructorInjection.collection1;

import java.util.Iterator;
import java.util.List;

//Injecting collection values by constructor in spring framework
public class Question {
    private int id;
    private String name;
    private List<String> answers;

    public Question() {
    }

    public Question(int id, String name, List<String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are: ");
        Iterator<String> iterator = answers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
