package spring.setterInjection.setterInjectionNonStringMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExamQuestion {
    private int id;
    private String name;
    private Map<Issues, User> issues;

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

    public Map<Issues, User> getIssues() {
        return issues;
    }

    public void setIssues(Map<Issues, User> issues) {
        this.issues = issues;
    }

    public void displayInfo() {
        System.out.println("Question Id: " + id);
        System.out.println("Question name: " + name);
        System.out.println("Answers.....");
        Set<Map.Entry<Issues, User>> set = issues.entrySet();
        Iterator<Map.Entry<Issues, User>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Issues, User> entry = iterator.next();
            Issues theIssue = entry.getKey();
            User theUsers = entry.getValue();
            System.out.println("Answer Information");
            System.out.println(theIssue);
            System.out.println("Posted By: ");
            System.out.println(theUsers);
        }

    }
}
