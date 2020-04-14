package spring.initMethodDestroyMethod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * init method - to perform certain action before bean initialization.
 * destroy method - to perform certain actions before bean destruction.
 */

@Component
public class DataStore {
    private List<Person> personList = new ArrayList<>();

    public void init() {
        Person person = new Person(1, "User");
        Person person1 = new Person(2, "Admin");
        Person person2 = new Person(3, "SuperAdmin");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);

        System.out.println("---------List of Persons available");

        for (Iterator<Person> iterator = personList.iterator(); iterator.hasNext(); ) {
            Person person3 = (Person) iterator.next();
            System.out.println(person3.toString());
        }
    }

    public void destroy() {
        //Delete from database
        personList.clear();
        System.out.println("-----------Remove user from list in the destroy method");
        for (Iterator<Person> iterator = personList.iterator(); iterator.hasNext(); ) {
            Person person3 = (Person) iterator.next();
            System.out.println(person3.toString());
        }

        System.out.println("End of destroy() method");

    }
}
