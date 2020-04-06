package spring.constructorInjection.collection2;

import java.util.Iterator;
import java.util.List;

//Constructor dependency with non-string Collection(Dependent object)
public class Question {
    private int id;
    private String name;
    private List<Answer> answers;

    public Question() {
    }

    public Question(int id, String name, List<Answer> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are: ");
        Iterator<Answer> iterator = answers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
