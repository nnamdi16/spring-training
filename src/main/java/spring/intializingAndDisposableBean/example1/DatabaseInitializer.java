package spring.intializingAndDisposableBean.example1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DatabaseInitializer implements InitializingBean, DisposableBean {
    private List<User> listOfUsers = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        User user = new User(1, "User");
        User user1 = new User(2, "Admin");
        User user2 = new User(3, "SuperAdmin");

        listOfUsers.add(user);
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        System.out.println("------------List of users added in init() method ------------------ ");
        for (Iterator<User> iterator = listOfUsers.iterator(); iterator.hasNext(); ) {
            User user3 = (User) iterator.next();
            System.out.println(user3.toString());
        }
    }

    @Override
    public void destroy() throws Exception {
        //Delete from Database
        listOfUsers.clear();
        System.out.println("---------------User removed from the List in destroy() method-----------");
        for (Iterator<User> iterator = listOfUsers.iterator(); iterator.hasNext(); ) {
            User user3 = (User) iterator.next();
            System.out.println(user3.toString());
        }
        System.out.println("List is cleaned up....");
    }
}
